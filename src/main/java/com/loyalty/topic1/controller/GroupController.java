package com.loyalty.topic1.controller;

import com.loyalty.topic1.response.ApiResponse;
import com.loyalty.topic1.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/group")
public class GroupController {

	@Autowired
	private GroupService groupService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ApiResponse<Object>> getGroupById(@PathVariable("id") Long idGroup)
	{
		return groupService.getLogicById(idGroup);
	}
	
	@GetMapping(value = "/all")
	public ApiResponse<Object> getAllLogic()
	{
		return groupService.getAllLogic();
	}

	@GetMapping(value = "/ByLabel/{idLabel}")
	public ResponseEntity<ApiResponse<Object>> getListGroupByIdLabel(@PathVariable("idLabel") Long idLabel)
	{
		return groupService.getListGroupByIdLabel(idLabel);
	}

	@GetMapping(value = "/ConditionNotNull")
	public ResponseEntity<ApiResponse<Object>> getListGroupWithConditionNotNull()
	{
		return groupService.getListGroupWithConditionNotNull();
	}

	@GetMapping(value = "/test")
	public ResponseEntity<String> test()
	{
		return groupService.checkCondition();
	}
}
