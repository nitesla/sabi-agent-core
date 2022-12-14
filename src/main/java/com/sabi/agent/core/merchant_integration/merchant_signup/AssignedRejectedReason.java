package com.sabi.agent.core.merchant_integration.merchant_signup;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AssignedRejectedReason {
    private boolean accepted;
    private String agentEmail;
    private String createdAt;
    private UUID id;
    private String name;
    private String ownerId;
    private ReasonDetails reasonDetails;
    private boolean resolved;
    private String updatedAt;
}
