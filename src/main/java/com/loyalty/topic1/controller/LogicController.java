package com.loyalty.topic1.controller;

import com.loyalty.topic1.request.LogicRequest;
import com.loyalty.topic1.response.ApiResponse;
import com.loyalty.topic1.service.LogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/logic")
public class LogicController {
	
	@Autowired
	private LogicService logicService;
	
	@PostMapping(value = "/add")
	public ResponseEntity<ApiResponse<Object>> addLogic(@RequestBody LogicRequest logicRequest)
	{
		return logicService.addLogic(logicRequest);
	}
}
