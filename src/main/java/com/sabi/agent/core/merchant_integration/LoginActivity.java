package com.sabi.agent.core.merchant_integration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginActivity {
    private String createdAt;
    private String deviceVerificationCode;
    private String id;
    private String loginActivityType;
    private String updatedAt;
    private boolean validCode;
}
