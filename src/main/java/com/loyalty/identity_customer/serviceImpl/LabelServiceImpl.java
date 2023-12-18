package com.loyalty.identity_customer.serviceImpl;

import com.loyalty.identity_customer.model.LabelModel;
import com.loyalty.identity_customer.repository.LabelRepository;
import com.loyalty.identity_customer.response.ApiResponse;
import com.loyalty.identity_customer.response.LabelResponse;
import com.loyalty.identity_customer.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LabelServiceImpl implements LabelService {

    @Autowired
    private LabelRepository labelRepository;

    @Override
    public ResponseEntity<ApiResponse<Object>> getLabelMapGroup() {
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponse.builder().data(labelRepository.getLabel()).build());
    }

    @Override
    public ResponseEntity<ApiResponse<Object>> activeLabel(Long labelId) {
        Optional<LabelModel> labelModel = labelRepository.findById(labelId);
        labelModel.get().setStatus("Đã kích hoạt");
        labelRepository.save(labelModel.get());
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponse.builder().message("Kích hoạt label thành công").data(labelModel.get()).build());
    }

    @Override
    public ResponseEntity<ApiResponse<Object>> getAllLabel() {
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponse.builder().message("All label").data(labelRepository.getAllLabel()).build());
    }

    @Override
    public ResponseEntity<ApiResponse<Object>> findByName(String labelName) {
        List<LabelResponse> listLabel = labelRepository.findByName(labelName);
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponse.builder().message("Danh sách label theo tên").data(listLabel).build());
    }
}
