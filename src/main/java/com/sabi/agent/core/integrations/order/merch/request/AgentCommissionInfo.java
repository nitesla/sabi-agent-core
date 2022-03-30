package com.sabi.agent.core.integrations.order.merch.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class AgentCommissionInfo {
    private String userId;
    private String agentName;
    private String phoneNumber;
    private int commissionType;
}
