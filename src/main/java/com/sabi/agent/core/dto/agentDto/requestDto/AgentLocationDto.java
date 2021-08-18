package com.sabi.agent.core.dto.agentDto.requestDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sabi.agent.core.models.agentModel.AgentLocation;
import lombok.Data;

@Data
public class AgentLocationDto {
    private long id;
    private AgentDto agentDto;
    @JsonProperty("locationType")
    private String locationType;
    private AgentLocation location;
    @JsonProperty("locationName")
    private String locationName;
}
