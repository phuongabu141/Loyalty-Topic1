package com.loyalty.topic1.serviceImpl;

import com.loyalty.topic1.repository.CustomerAttributeRepository;
import com.loyalty.topic1.response.ApiResponse;
import com.loyalty.topic1.service.CustomerAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CustomerAttributeImpl implements CustomerAttributeService {

    @Autowired
    private CustomerAttributeRepository customerAttributeRepository;

    @Override
    public ResponseEntity<ApiResponse<Object>> getListCustomerAttribute() {
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponse.builder().message("Danh sách thuộc tính khách hàng kèm giá trị").data(customerAttributeRepository.getListCustomerAttribute()).build());
    }
}
