package com.sabi.agent.core.dto.agentDto.requestDto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sabi.agent.core.models.agentModel.Agent;
import lombok.Data;

@Data
public class AgentTargetDto {

    private long id;


    private String name;

    @JsonIgnore
    private Agent agent;


    private String targetType;


    private Integer min;
    private Integer max;
    private Integer superMax;
}
