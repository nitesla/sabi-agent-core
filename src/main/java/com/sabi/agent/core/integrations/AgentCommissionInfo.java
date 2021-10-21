package com.sabi.agent.core.integrations;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AgentCommissionInfo {
    private String userId;
    private String phoneNumber;
    private int commissionType;
}
