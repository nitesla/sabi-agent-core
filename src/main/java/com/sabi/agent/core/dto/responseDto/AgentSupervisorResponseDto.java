package com.sabi.agent.core.dto.responseDto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sabi.agent.core.models.Supervisor;
import com.sabi.agent.core.models.agentModel.Agent;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgentSupervisorResponseDto {

    private Agent agent;
    private Supervisor supervisor;
    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    private Long createdBy;

    private Long updatedBy;

    private Boolean isActive;
}
