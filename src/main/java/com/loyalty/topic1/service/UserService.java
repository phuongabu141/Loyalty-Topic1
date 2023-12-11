package com.loyalty.topic1.service;

import com.loyalty.topic1.model.UserModel;
import com.loyalty.topic1.repository.UserRepository;
import com.loyalty.topic1.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    public ResponseEntity<ApiResponse<Object>> getAllUser();
}
