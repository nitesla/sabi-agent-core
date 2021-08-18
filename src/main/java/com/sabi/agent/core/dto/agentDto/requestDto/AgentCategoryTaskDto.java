package com.sabi.agent.core.dto.agentDto.requestDto;

import com.sabi.agent.core.dto.requestDto.TaskDto;
import lombok.Data;

@Data
public class AgentCategoryTaskDto {

    private long id;
    private long agentCategoryId;
    private TaskDto task;

}
