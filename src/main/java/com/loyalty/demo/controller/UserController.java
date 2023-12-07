package com.loyalty.demo.controller;

import com.loyalty.demo.response.ApiResponse;
import com.loyalty.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "api/user")
public class UserController {

    @Autowired
    private UserService userService;
    
    
    @GetMapping(value = "/all")
    public ResponseEntity<ApiResponse<Object>> getAllUser()
    {
        return userService.getAllUser();
    }
    
}
