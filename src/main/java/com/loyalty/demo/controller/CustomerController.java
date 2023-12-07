package com.loyalty.demo.controller;

import com.loyalty.demo.response.ApiResponse;
import com.loyalty.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/all")
    public ApiResponse<Object> getAllCustomer()
    {
        return customerService.getAllCustomer();
    }

}
