package com.sabi.agent.core.dto.responseDto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgentSupervisorResponseDto {

    /**
     * Retrives necessary ids like primary key(id), agent and supervisor ids.
     * @Author Afam Okonkwo
     * @Date 21/04/2022
     */
    private  Long id;
    private Long agentId;
    private Long supervisorId;
    private String agentName;
    private String supervisorName;
    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    private Long createdBy;

    private Long updatedBy;

    private Boolean isActive;
}
