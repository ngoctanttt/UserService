package com.tanln.invoice.userserivice.Controller;

import com.tanln.invoice.userserivice.Service.AuthService;
import com.tanln.invoice.userserivice.domain.dto.AuthenticationResponse;
import com.tanln.invoice.userserivice.domain.dto.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user/auth")
public class AuthController {
    @Autowired
    AuthService authService;

    @GetMapping("/test")
    public String testGet(){
        return authService.getAccessToken("test","password");
    }



    @PostMapping("/login")
    public AuthenticationResponse getToken(@RequestBody LoginRequest loginRequest){
        String accessToken = authService.getAccessToken(loginRequest.getTaxCode(), loginRequest.getPassword());
        return new AuthenticationResponse(accessToken,accessToken);
    }


    @PostMapping("/register")
    public String register(){
        return "Admin";
    }


}
