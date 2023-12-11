package com.loyalty.topic1.controller;

import com.loyalty.topic1.response.ApiResponse;
import com.loyalty.topic1.service.CustomerAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer_attribute")
public class CustomerAttributeController {

    @Autowired
    private CustomerAttributeService customerAttributeService;

    @GetMapping("/all")
    public ResponseEntity<ApiResponse<Object>> getListCustomerAttribute()
    {
        return customerAttributeService.getListCustomerAttribute();
    }
}
