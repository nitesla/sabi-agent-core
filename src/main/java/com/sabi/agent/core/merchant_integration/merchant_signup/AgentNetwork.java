package com.sabi.agent.core.merchant_integration.merchant_signup;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AgentNetwork {
    private String createdAt;
    private String createdBy;
    private String description;
    private String id;
    private String name;
    private String updatedAt;
}
