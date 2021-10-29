package com.sabi.agent.core.dto.agentDto.requestDto;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class AgentTargetDto {

    private long id;
    private String name;
    private Long targetId;
    private Long agentId;
    @NotNull(message = "Min can not be empty")
    @Min(value = 1, message = "Min can not be less than 1")
    private Integer min;
    @NotNull(message = "Max can not be empty")
    @Min(value = 1, message = "Max can not be less than 1")
    private Integer max;
    @NotNull(message = "SuperMax can not be empty")
    @Min(value = 1, message = "SuperMax can not be less than 1")
    private Integer superMax;
}
