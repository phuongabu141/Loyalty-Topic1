package com.loyalty.identity_customer.serviceImpl;

import com.loyalty.identity_customer.repository.ConditionRepository;
import com.loyalty.identity_customer.response.ApiResponse;
import com.loyalty.identity_customer.service.ConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ConditionServiceImpl implements ConditionService {

    @Autowired
    private ConditionRepository conditionRepository;

    @Override
    public ResponseEntity<ApiResponse<Object>> getConditionById(Long idCondition) {
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponse.builder().message("Condition By Id").data(conditionRepository.getConditionById(idCondition)).build());
    }
}
