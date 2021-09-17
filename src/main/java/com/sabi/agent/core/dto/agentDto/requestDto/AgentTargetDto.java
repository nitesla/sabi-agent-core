package com.sabi.agent.core.dto.agentDto.requestDto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sabi.agent.core.models.agentModel.Agent;
import lombok.Data;

@Data
public class AgentTargetDto {

    private long id;
    private String name;
    private Long targetId;
    private Long agentId;
    private Integer min;
    private Integer max;
    private Integer superMax;
}
