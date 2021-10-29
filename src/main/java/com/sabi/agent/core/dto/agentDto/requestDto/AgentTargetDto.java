package com.sabi.agent.core.dto.agentDto.requestDto;

import lombok.Data;

import javax.validation.constraints.Min;

@Data
public class AgentTargetDto {

    private long id;
    private String name;
    private Long targetId;
    private Long agentId;
    @Min(value = 1, message = "Min can not be less than 1")
    private Integer min;
    @Min(value = 1, message = "Max can not be less than 1")
    private Integer max;
    @Min(value = 1, message = "SuperMax can not be less than 1")
    private Integer superMax;
}
