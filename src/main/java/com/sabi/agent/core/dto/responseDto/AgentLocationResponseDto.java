package com.sabi.agent.core.dto.responseDto;

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
