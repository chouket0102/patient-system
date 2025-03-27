package com.example.demo.login;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="api/v1/login")
@CrossOrigin(origins = "http://localhost:5173")
@AllArgsConstructor
public class LoginController {
    private final LoginService loginService;

    @PostMapping
    public String login(@RequestBody LoginRequest request) {
        return loginService.login(request);
    }
}