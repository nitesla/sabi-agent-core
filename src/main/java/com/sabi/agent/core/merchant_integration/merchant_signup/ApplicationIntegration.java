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
public class ApplicationIntegration {
    private String createdAt;
    private Credentials credentials;
    private UUID id;
    private String integratedApplicationName;
    private String updatedAt;
}
