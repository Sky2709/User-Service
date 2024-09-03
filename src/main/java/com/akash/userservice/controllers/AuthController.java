package com.akash.userservice.controllers;

import com.akash.userservice.dtos.*;
import com.akash.userservice.models.Session;
import com.akash.userservice.models.SessionStatus;
import com.akash.userservice.sevices.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

//    @PostMapping("/login")
//    public ResponseEntity<UserDTO> login(@RequestBody LoginRequestDTO loginRequestDTO){
//        return authService.logIn(loginRequestDTO.getEMail(), loginRequestDTO.getPassword());
//    }

    @PostMapping("/signup")
    public ResponseEntity<UserDTO> signUp(@RequestBody SignUpRequestDTO signUpRequestDTO){
        return authService.signUp(signUpRequestDTO.getEMail(), signUpRequestDTO.getPassword());
    }

    @PostMapping("/logout")
    public ResponseEntity<Void> logOut(@RequestBody LogOutRequestDTO logOutRequestDTO){
        return authService.logOut(logOutRequestDTO.getToken(), logOutRequestDTO.getUserId());
    }

    @PostMapping("/validate")
    public SessionStatus validateToken(@RequestBody ValidateTokenRequestDTO validateTokenRequestDTO){
        return authService.validateToken(validateTokenRequestDTO.getToken(), validateTokenRequestDTO.getUserId());
    }




}
