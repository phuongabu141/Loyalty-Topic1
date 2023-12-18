package com.loyalty.identity_customer.serviceImpl;

import com.loyalty.identity_customer.repository.CustomerLabelRepository;
import com.loyalty.identity_customer.response.ApiResponse;
import com.loyalty.identity_customer.service.CustomerLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CustomerLabelServiceImpl implements CustomerLabelService {

    @Autowired
    private CustomerLabelRepository customerLabelRepository;
    @Override
    public ResponseEntity<ApiResponse<Object>> getListCustomerByLabelId(Long labelId) {
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponse.builder().message("Danh sách khách hàng đã được gán label").data(customerLabelRepository.getListCustomerByLabelId(labelId)).build());
    }
}
