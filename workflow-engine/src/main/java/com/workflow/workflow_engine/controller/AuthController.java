package com.workflow.workflow_engine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workflow.workflow_engine.dto.LoginRequest;
import com.workflow.workflow_engine.entity.User;
import com.workflow.workflow_engine.repository.UserRepository;
import com.workflow.workflow_engine.security.JwtUtil;
import com.workflow.workflow_engine.service.AuthService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

private final UserRepository userRepository;
private final JwtUtil jwtUtil;

@Autowired
private AuthService authService;

@PostMapping("/register")
public User register(@RequestBody User user){

return authService.register(user);

}

@PostMapping("/login")
public String login(@RequestBody LoginRequest request){

User user = userRepository.findByEmail(request.getEmail()).orElseThrow();

return jwtUtil.generateToken(user.getEmail());
}

}	
