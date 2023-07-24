package com.estudo.security.authent;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authetication")
@RequiredArgsConstructor
public class AutheticationController {
    @PostMapping("/register")
    public ResponseEntity<AuthenticationRequest> register(@RequestBody RegisterRequest registerRequest){

    }
    @PostMapping("/authenticated")
    public ResponseEntity<AutheticationResponse> autheticate(@RequestBody AuthenticationRequest authenticationRequest){

    }
}
