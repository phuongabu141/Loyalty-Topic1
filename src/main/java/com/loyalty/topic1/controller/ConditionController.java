package com.loyalty.topic1.controller;

import com.loyalty.topic1.response.ApiResponse;
import com.loyalty.topic1.service.ConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/condition")
public class ConditionController {

    @Autowired
    private ConditionService conditionService;

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<Object>> getConditionById(@PathVariable("id") Long idCondition)
    {
        return conditionService.getConditionById(idCondition);
    }
}
