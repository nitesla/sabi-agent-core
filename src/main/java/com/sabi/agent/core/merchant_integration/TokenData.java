package com.sabi.agent.core.merchant_integration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TokenData {
    private String expiresIn;
    private String fingerPrint;
    private Boolean initialFingerPrintCheck;
    private List<String> realmNames;
    private String refreshExpiresIn;
    private String refreshToken;
    private String role;
    private String token;
    private String userId;
}
