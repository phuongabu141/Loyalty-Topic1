package com.loyalty.topic1.service;

import com.loyalty.topic1.model.ProductModel;
import com.loyalty.topic1.repository.ProductRepository;
import com.loyalty.topic1.request.ProductRequest;
import com.loyalty.topic1.response.ApiResponse;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {

    public ResponseEntity<ApiResponse<Object>> getAllProduct();

    public ResponseEntity<ApiResponse<Object>> addProduct(ProductRequest productRequest);
}
