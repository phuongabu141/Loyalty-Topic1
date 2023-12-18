package com.loyalty.identity_customer.controller;

import com.loyalty.identity_customer.response.ApiResponse;
import com.loyalty.identity_customer.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/label")
public class LabelController {

    @Autowired
    private LabelService labelService;

    @GetMapping("/LabelMapGroup")
    public ResponseEntity<ApiResponse<Object>> getLabelMapGroup(){
        return labelService.getLabelMapGroup();
    }

    @PutMapping("/activeLabel/{labelId}")
    public ResponseEntity<ApiResponse<Object>> activeLabel(@PathVariable("labelId") Long labelId)
    {
        return labelService.activeLabel(labelId);
    }

    @GetMapping("/all")
    public ResponseEntity<ApiResponse<Object>> getAllLabel()
    {
        return labelService.getAllLabel();
    }

    @GetMapping("/search")
    public ResponseEntity<ApiResponse<Object>> findByName(@RequestParam("labelName") String labelName)
    {
        return labelService.findByName(labelName);
    }
}
