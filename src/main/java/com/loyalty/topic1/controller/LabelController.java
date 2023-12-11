package com.loyalty.topic1.controller;

import com.loyalty.topic1.response.ApiResponse;
import com.loyalty.topic1.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/label")
public class LabelController {

    @Autowired
    private LabelService labelService;

    @GetMapping("/LabelMapGroup")
    public ResponseEntity<ApiResponse<Object>> getLabelMapGroup(){
        return labelService.getLabelMapGroup();
    }
}
