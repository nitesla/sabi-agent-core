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
public class AgentBankResponseDto {
    private Long id;
    private Long agentId;
    private Long bankId;
    private String agentFirstName;
    private String agentLastName;
    private String bankName;
    private String accountNumber;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    private Long createdBy;

    private Long updatedBy;

    private Boolean isActive;
    private boolean isDefault;

    }
