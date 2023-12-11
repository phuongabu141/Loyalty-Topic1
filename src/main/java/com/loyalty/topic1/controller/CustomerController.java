package com.loyalty.topic1.controller;

import com.loyalty.topic1.response.ApiResponse;
import com.loyalty.topic1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    
    @GetMapping(value = "/{id}")
    public ApiResponse<Object> getCustomerByCustomer(@PathVariable("id") Long idCustomer)
    {
    	return customerService.getCustomerById(idCustomer);
    }

}
