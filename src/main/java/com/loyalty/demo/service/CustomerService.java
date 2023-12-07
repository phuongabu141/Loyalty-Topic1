package com.loyalty.demo.service;

import com.loyalty.demo.response.ApiResponse;
import com.loyalty.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public ApiResponse<Object> getAllCustomer()
    {
        return ApiResponse.builder().data(customerRepository.findAll()).build();
    }
}
