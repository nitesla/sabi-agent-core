package com.sabi.agent.core.dto.agentDto.requestDto;


import lombok.Data;

@Data
public class AgentCategoryTargetDto {

    private AgentCategoryDto agentCategoryDto;
    private Integer min;
    private Integer max;
    private Integer superMax;
}
