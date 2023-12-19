package com.loyalty.identity_customer.controller;

import com.loyalty.identity_customer.response.ApiResponse;
import com.loyalty.identity_customer.service.CustomerAttributeService;
import com.loyalty.identity_customer.service.PartnerRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/partner_request")
public class PartnerRequestController {
    @Autowired
    private PartnerRequestService partnerRequestService;

    @GetMapping("/all")
    public ResponseEntity<ApiResponse<Object>> getPartnerRequest()
    {
        return partnerRequestService.getListPartnerRequest();
    }
}
