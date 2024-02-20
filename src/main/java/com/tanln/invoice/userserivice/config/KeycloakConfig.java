package com.tanln.invoice.userserivice.config;

import org.keycloak.admin.client.Keycloak;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KeycloakConfig {
    @Bean
    public Keycloak getKeycloakInstance() {
        return Keycloak.getInstance(
                "http://localhost:8080",
                "TanApp",
                "tanadmin",
                "password",
                "invoice",
                "USTOcuDv7vhlIlVJb2wuv5flR078nEgC");
    }
}
