package com.example.weblogin.web.dto;

import com.example.weblogin.domain.user.User;
import com.example.weblogin.service.AuthService;
import com.example.weblogin.web.dto.auth.SignupDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class AuthController {

    private final AuthService authService;

    @GetMapping("/signin")
    public String SigninForm() {
        return "signin";
    }

    @GetMapping("/signup")
    public String SignupForm() {
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(SignupDto signupDto) {

        // User에 signupDto 넣음
        User user = signupDto.toEntity();

        User userEntity = authService.signup(user);
        System.out.println(userEntity);

        return "signin";
    }
}
