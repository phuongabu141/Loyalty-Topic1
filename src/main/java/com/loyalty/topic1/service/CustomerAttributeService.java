package com.loyalty.topic1.service;

import com.loyalty.topic1.response.ApiResponse;
import org.springframework.http.ResponseEntity;

public interface CustomerAttributeService {

    public ResponseEntity<ApiResponse<Object>> getListCustomerAttribute();

}
