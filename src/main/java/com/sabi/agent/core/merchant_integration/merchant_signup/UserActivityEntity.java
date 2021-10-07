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
public class UserActivityEntity {
    private String body;
    private String createdAt;
    private String fingerprint;
    private UUID id;
    private String ipAddress;
    private String method;
    private String updatedAt;
    private String url;
    private String userAgent;
}
