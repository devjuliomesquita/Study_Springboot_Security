package com.estudo.security.authent;

import com.estudo.security.domain.user.User;
import com.estudo.security.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository userRepository;
    public AuthenticationResponse register(RegisterRequest registerRequest){
        var user = User.builder()
                .name(registerRequest.getUserName())
                .email(registerRequest.getEmail())
                .password(registerRequest.getPassword())
                .role(registerRequest.getRole())
                .build();
        var savedUser = userRepository.save(user);

        return AuthenticationResponse.builder().build();
    }
}
