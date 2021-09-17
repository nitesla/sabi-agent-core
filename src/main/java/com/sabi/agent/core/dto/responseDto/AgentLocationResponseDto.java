package com.sabi.agent.core.dto.responseDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sabi.agent.core.dto.agentDto.requestDto.AgentUpdateDto;
import com.sabi.agent.core.models.agentModel.AgentLocation;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AgentLocationResponseDto {
    private long id;
    private Long agentId;
    private String locationType;
    private Long locationId;
    private String locationName;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
