package com.loyalty.topic1.service;

import com.loyalty.topic1.model.LogicModel;
import com.loyalty.topic1.repository.LogicRepository;
import com.loyalty.topic1.request.LogicRequest;
import com.loyalty.topic1.response.ApiResponse;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


public interface LogicService {

	public ResponseEntity<ApiResponse<Object>> addLogic(LogicRequest logicRequest);
}
