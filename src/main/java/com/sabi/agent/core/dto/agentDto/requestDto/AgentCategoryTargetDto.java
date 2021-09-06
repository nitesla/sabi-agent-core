package com.sabi.agent.core.dto.agentDto.requestDto;


import lombok.Data;

@Data
public class AgentCategoryTargetDto {

    private long id;
    private String name;
    private long agentCategoryId;
    private Integer min;
    private Integer max;
    private Integer superMax;
    private long targetTypeId;
}
