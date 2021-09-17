package com.sabi.agent.core.dto.agentDto.requestDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AgentLocationDto {
    private Long id;
    private Long agentId;
    private String locationType;
    private Long locationId;
    private String locationName;
}
