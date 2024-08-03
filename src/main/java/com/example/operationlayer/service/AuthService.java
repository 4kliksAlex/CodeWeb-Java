package com.example.operationlayer.service;

import com.example.operationlayer.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
    public boolean registerUser(UserDto userDto);

    public boolean loginUser(UserDto userDto);

    // Add your authentication and registration logic here
}