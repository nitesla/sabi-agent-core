package com.sabi.agent.core.dto.agentDto.requestDto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class AgentCategoryDto {

    private Long id;

    @NotNull
    @NotEmpty
    private String name;

}
