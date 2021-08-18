package com.sabi.agent.core.dto.agentDto.requestDto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sabi.agent.core.models.Supervisor;
import com.sabi.agent.core.models.agentModel.Agent;
import lombok.Data;

@Data
public class AgentSupervisor {

    private long id;

    @JsonIgnore
    private Agent agent;

    @JsonIgnore
    private Supervisor supervisor;
}
