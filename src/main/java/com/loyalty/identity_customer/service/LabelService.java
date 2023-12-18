package com.loyalty.identity_customer.service;

import com.loyalty.identity_customer.response.ApiResponse;
import org.springframework.http.ResponseEntity;

public interface LabelService {

    public ResponseEntity<ApiResponse<Object>> getLabelMapGroup();

    // function active Label
    public ResponseEntity<ApiResponse<Object>> activeLabel(Long labelId);

    public ResponseEntity<ApiResponse<Object>> getAllLabel();

    public ResponseEntity<ApiResponse<Object>> findByName(String labelName);
}
