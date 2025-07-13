package com.luv2code.springboot.todoapi.service;

import com.luv2code.springboot.todoapi.request.AuthenticationRequest;
import com.luv2code.springboot.todoapi.request.RegisterRequest;
import com.luv2code.springboot.todoapi.response.AuthenticationResponse;

public interface AuthenticationService {
    void register(RegisterRequest registerRequest) throws Exception;

    AuthenticationResponse login(AuthenticationRequest request);
}
