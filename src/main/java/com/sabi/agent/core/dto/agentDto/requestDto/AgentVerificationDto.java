package com.sabi.agent.core.dto.agentDto.requestDto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sabi.framework.models.User;
import lombok.Data;

@Data
public class AgentVerificationDto {

    private long id;

    @JsonIgnore
    private AgentUpdateDto agentDto;
    private String component;
    private String status;
    private User verifierId;
}
