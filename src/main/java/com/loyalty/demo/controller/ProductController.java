package com.loyalty.demo.controller;

import com.loyalty.demo.request.ProductRequest;
import com.loyalty.demo.response.ApiResponse;
import com.loyalty.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/all")
    public ResponseEntity<ApiResponse<Object>> getAllProduct()
    {
        return productService.getAllProduct();
    }

    @PostMapping(value = "/add")
    public ResponseEntity<ApiResponse<Object>> addProduct(@RequestBody ProductRequest productRequest){
        return productService.addProduct(productRequest);
    }
}
