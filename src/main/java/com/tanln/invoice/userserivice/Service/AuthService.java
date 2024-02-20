package com.tanln.invoice.userserivice.Service;

import org.keycloak.admin.client.Keycloak;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    Keycloak keycloak;

    public String getAccessToken(String username, String password){
        Keycloak keycloak =  Keycloak.getInstance(
                "http://localhost:8080",
                "TanApp",
                username,
                password,
                "invoice",
                "USTOcuDv7vhlIlVJb2wuv5flR078nEgC");
        return keycloak.tokenManager().getAccessTokenString();
    }


}
