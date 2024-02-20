package com.tanln.invoice.userserivice.Controller;

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.tanln.invoice.userserivice.Service.UserService;
import com.tanln.invoice.userserivice.entity.User;


import org.jose4j.jwt.JwtClaims;
import org.jose4j.jwt.MalformedClaimException;
import org.jose4j.jwt.consumer.InvalidJwtException;
import org.jose4j.jwt.consumer.JwtConsumer;
import org.jose4j.jwt.consumer.JwtConsumerBuilder;
import org.keycloak.admin.client.Keycloak;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@RestController
@RequestMapping("/api/v1/user/user")
public class UserServiceController {
    @Autowired
    JwtConsumer consumer;
    @Autowired
    UserService userService;

    @GetMapping("/info")
    public User getUser(@RequestHeader("Authorization") String token) throws InvalidJwtException, MalformedClaimException {
        String accessToken = token.substring(7);
        JwtClaims claims = consumer.processToClaims(accessToken);
        String taxCode = claims.getClaimValue("preferred_username").toString();
        System.out.println(taxCode);
        return userService.getUserInfo(taxCode);
    }
}
