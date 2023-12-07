package com.loyalty.demo.service;

import com.loyalty.demo.model.ProductModel;
import com.loyalty.demo.repository.ProductRepository;
import com.loyalty.demo.request.ProductRequest;
import com.loyalty.demo.response.ApiResponse;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private KieSession kieSession;

    public ResponseEntity<ApiResponse<Object>> getAllProduct()
    {
        List<ProductModel> productModelList = productRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponse.builder().message("lấy danh sách sản phẩm thành công").data(productModelList).build());
    }

    public ResponseEntity<ApiResponse<Object>> addProduct(ProductRequest productRequest)
    {
        ProductModel newProductModel = ProductModel.builder().name(productRequest.getName()).price(productRequest.getPrice()).build();
        kieSession.insert(newProductModel);
        kieSession.fireAllRules();
        kieSession.dispose();
        if(newProductModel.getPrice() == null)
        {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ApiResponse.builder().message("Sản phẩm thêm vào có giá không quá 15000").build());
        }
        productRepository.save(newProductModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(ApiResponse.builder().message("Thêm sản phẩm mới thành công").data(newProductModel).build());
    }
}
