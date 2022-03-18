package com.sabi.agent.core.dto.responseDto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgentCategoryTargetResponseDto {

    private Long id;

    private String name;

    private Long agentCategoryId;

    private Long targetTypeId;

    private String agentCategoryName;

    private String targetTypeName;

    private Integer min;

    private Integer max;

    private Integer superMax;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    private Long createdBy;

    private Long updatedBy;

    private Boolean isActive;


    }
