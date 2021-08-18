package com.sabi.agent.core.dto.agentDto.requestDto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sabi.agent.core.models.agentModel.Agent;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class AgentTargetDto {

    private long id;

    @NotNull
    @NotEmpty
    private String name;

    @JsonIgnore
    private Agent agent;

    @NotNull
    @NotEmpty
    private String targetType;

    @NotNull
    @NotEmpty
    private Integer min;
    private Integer max;
    private Integer superMax;
}
