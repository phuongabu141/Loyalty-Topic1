package com.loyalty.topic1.service;

import com.loyalty.topic1.repository.CustomerRepository;
import com.loyalty.topic1.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface CustomerService {

    public ApiResponse<Object> getAllCustomer();
    
    public ApiResponse<Object> getCustomerById(Long idCustomer);
}
