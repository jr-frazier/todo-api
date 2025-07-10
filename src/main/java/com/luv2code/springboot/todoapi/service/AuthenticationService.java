package com.luv2code.springboot.todoapi.service;

import com.luv2code.springboot.todoapi.request.RegisterRequest;

public interface AuthenticationService {
    void register(RegisterRequest registerRequest) throws Exception;
}
