package com.loyalty.topic1.serviceImpl;

import com.loyalty.topic1.model.UserModel;
import com.loyalty.topic1.repository.UserRepository;
import com.loyalty.topic1.response.ApiResponse;
import com.loyalty.topic1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public ResponseEntity<ApiResponse<Object>> getAllUser()
    {
        List<UserModel> userModels = userRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponse.builder().message("Lấy danh sách người dùng thành công").data(userModels).build());
    }
}
