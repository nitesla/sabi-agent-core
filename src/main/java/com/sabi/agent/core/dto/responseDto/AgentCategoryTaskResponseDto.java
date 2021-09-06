package com.sabi.agent.core.dto.responseDto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgentCategoryTaskResponseDto {

    private Long id;

    private String name;

    private Long agentCategoryId;

    private Long taskId;

    private String taskType;

    private String priority;

    private int duration;

    private String durationType;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    private Long createdBy;

    private Long updatedBy;

    private Boolean isActive;
}
