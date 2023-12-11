package com.loyalty.topic1.service;

import com.loyalty.topic1.repository.GroupRepository;
import com.loyalty.topic1.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


public interface GroupService {
	
	public ResponseEntity<ApiResponse<Object>> getLogicById(Long idLogic);
	
	public ApiResponse<Object> getAllLogic();

	public ResponseEntity<ApiResponse<Object>> getListGroupByIdLabel(Long idLabel);

	public ResponseEntity<ApiResponse<Object>> getListGroupWithConditionNotNull();

	public ResponseEntity<String> checkCondition();

}
