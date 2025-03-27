package com.example.demo.login;

import com.example.demo.appuser.AppUser;
import com.example.demo.appuser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LoginService {
    private final AppUserService appUserService;
    private final PasswordEncoder passwordEncoder;

    public String login(LoginRequest request) {
        // Find user by email
        AppUser user = appUserService.findByEmail(request.getEmail())
                .orElseThrow(() -> new IllegalStateException("User not found"));

        // Validate password
        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            throw new IllegalStateException("Invalid password");
        }

        // Return success message or user details
        return "Login successful";
    }
}