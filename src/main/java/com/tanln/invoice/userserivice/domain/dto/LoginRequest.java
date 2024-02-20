package com.tanln.invoice.userserivice.domain.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String taxCode;

    private String password;
}
