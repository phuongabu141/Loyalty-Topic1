package com.loyalty.topic1.serviceImpl;

import com.loyalty.topic1.repository.LabelRepository;
import com.loyalty.topic1.response.ApiResponse;
import com.loyalty.topic1.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LabelServiceImpl implements LabelService {

    @Autowired
    private LabelRepository labelRepository;

    @Override
    public ResponseEntity<ApiResponse<Object>> getLabelMapGroup() {
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponse.builder().data(labelRepository.getLabel()).build());
    }
}
