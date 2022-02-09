package com.sabi.agent.core.dto.responseDto;

import com.sabi.agent.core.models.agentModel.Agent;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AgentTargetResponseDto {
    private String name;
    private Agent agentId;
    private Long targetId;
    private Integer min;
    private Integer max;
    private Integer superMax;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    private Long createdBy;

    private Long updatedBy;

    private Boolean isActive;
}
