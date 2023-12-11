package com.loyalty.topic1.serviceImpl;

import com.loyalty.topic1.repository.CustomerRepository;
import com.loyalty.topic1.response.ApiResponse;
import com.loyalty.topic1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public ApiResponse<Object> getAllCustomer()
    {
        return ApiResponse.builder().data(customerRepository.findAll()).build();
    }

    @Override
    public ApiResponse<Object> getCustomerById(Long idCustomer)
    {
        return ApiResponse.builder().data(customerRepository.findById(idCustomer)).message("Lấy khách hàng theo id khách hàng").build();
    }
}
