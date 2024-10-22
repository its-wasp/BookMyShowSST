package com.example.bookmyshowsst.controllers;

import com.example.bookmyshowsst.dtos.*;
import com.example.bookmyshowsst.dtos.ResponseStatus;
import com.example.bookmyshowsst.models.User;
import com.example.bookmyshowsst.services.UserService;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;

    }
    @PostMapping("/signup")
    public SignUpResponseDto signUp(@RequestBody SignUpRequestDto requestDto){

        User user = userService.signup(
                requestDto.getName(),
                requestDto.getEmail(),
                requestDto.getPassword()
        );

        SignUpResponseDto responseDto = new SignUpResponseDto();
        responseDto.setEmail(user.getEmail());
        responseDto.setSignUpStatus(ResponseStatus.SUCCESS);
        responseDto.setId(user.getId());

        return responseDto;
    }

    @GetMapping("/login")

    public LoginResponseDto login(@RequestBody LoginRequestDto requestDto){
        ResponseStatus responseStatus = userService.login(
                requestDto.getEmail(),
                requestDto.getPassword()
        );

        LoginResponseDto responseDto = new LoginResponseDto();
        responseDto.setResponseStatus(responseStatus);
        return responseDto;
    }
}
