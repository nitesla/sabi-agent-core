package com.sabi.agent.core.dto.agentDto.requestDto;

import lombok.Data;

@Data
public class AgentCategoryTaskDto {

    private Long id;
    private String name;
    private Long agentCategoryId;
    private Long taskId;
    private String taskName;
    private String agentCategoryName;

}
