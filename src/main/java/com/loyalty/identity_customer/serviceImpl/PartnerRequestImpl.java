package com.loyalty.identity_customer.serviceImpl;

import com.loyalty.identity_customer.model.PartnerRequestModel;
import com.loyalty.identity_customer.repository.PartnerRequestRepository;
import com.loyalty.identity_customer.response.ApiResponse;
import com.loyalty.identity_customer.response.PartnerRequestResponse;
import com.loyalty.identity_customer.service.PartnerRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartnerRequestImpl implements PartnerRequestService {

    @Autowired
    private PartnerRequestRepository partnerRequestRepository;

    @Override
    public ResponseEntity<ApiResponse<Object>> getListPartnerRequest() {
        List<PartnerRequestModel> requestModelLis = partnerRequestRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponse.builder().data(requestModelLis).build());
    }
}
