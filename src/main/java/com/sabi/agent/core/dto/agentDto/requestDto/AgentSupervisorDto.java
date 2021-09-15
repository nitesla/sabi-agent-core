package com.sabi.agent.core.dto.agentDto.requestDto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sabi.agent.core.models.Supervisor;
import com.sabi.agent.core.models.agentModel.Agent;
import lombok.Data;

@Data
public class AgentSupervisorDto {
    private Long id;

    private Long agentId;

    private Long supervisorId;
}
