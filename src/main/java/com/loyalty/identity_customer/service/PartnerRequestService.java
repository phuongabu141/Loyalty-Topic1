package com.loyalty.identity_customer.service;

import com.loyalty.identity_customer.response.ApiResponse;
import com.loyalty.identity_customer.response.PartnerRequestResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PartnerRequestService {
    public ResponseEntity<ApiResponse<Object>> getListPartnerRequest();
}
