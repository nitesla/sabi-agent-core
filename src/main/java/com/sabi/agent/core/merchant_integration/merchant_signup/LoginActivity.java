package com.sabi.agent.core.merchant_integration.merchant_signup;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginActivity {
    private String createdAt;
    private String deviceVerificationCode;
    private UUID id;
    private String loginActivityType;
    private String updatedAt;
    private boolean validCode;
}
