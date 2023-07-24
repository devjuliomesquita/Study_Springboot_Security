package com.estudo.security.authent;

import com.estudo.security.domain.user.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterRequest {
    private String userName;
    private String email;
    private String password;
    private Role role;
}
