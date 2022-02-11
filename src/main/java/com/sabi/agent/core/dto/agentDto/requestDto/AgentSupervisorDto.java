package com.sabi.agent.core.dto.agentDto.requestDto;

import lombok.Data;

@Data
public class AgentSupervisorDto {
    private Long id;

    private Long agentId;

    private Long supervisorId;
}
