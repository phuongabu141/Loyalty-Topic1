package com.loyalty.demo.service;

import com.loyalty.demo.model.UserModel;
import com.loyalty.demo.repository.UserRepository;
import com.loyalty.demo.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public ResponseEntity<ApiResponse<Object>> getAllUser()
    {
        List<UserModel> userModels = userRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponse.builder().message("Lấy danh sách người dùng thành công").data(userModels).build());
    }
}
