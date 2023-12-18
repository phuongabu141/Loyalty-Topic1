package com.loyalty.identity_customer.service;

import com.loyalty.identity_customer.response.ApiResponse;
import org.springframework.http.ResponseEntity;

public interface CustomerLabelService {

    public ResponseEntity<ApiResponse<Object>> getListCustomerByLabelId(Long labelId);
}
