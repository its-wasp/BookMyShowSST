package com.example.bookmyshowsst.services;

import com.example.bookmyshowsst.dtos.ResponseStatus;
import com.example.bookmyshowsst.dtos.SignUpRequestDto;
import com.example.bookmyshowsst.dtos.SignUpResponseDto;
import com.example.bookmyshowsst.models.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User signup(String name, String email, String password);
    ResponseStatus login(String email, String password);

}
