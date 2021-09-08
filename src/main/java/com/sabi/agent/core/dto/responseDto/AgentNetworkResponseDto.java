package com.sabi.agent.core.dto.responseDto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AgentNetworkResponseDto {
    private long id;
    private Long agentId;
    private Long subAgentId;
    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    private Long createdBy;

    private Long updatedBy;

    private Boolean isActive;
}
