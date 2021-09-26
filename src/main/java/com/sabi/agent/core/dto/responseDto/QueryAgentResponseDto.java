package com.sabi.agent.core.dto.responseDto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryAgentResponseDto {

    private Long id;

    private Long agentCategoryId;
    private String agentCategory;
    private long userId;
    private String user;
    private String scope;
    private String referralCode;
    private String address;
    private String bvn;
    private String agentType;
    private Long creditLimit;
    private Integer payBackDuration;
    private String comment;
    private String cardToken;
    private int status;
    private String walletId;
    private String picture;
    private Boolean hasCustomizedTarget;
    private Long creditLevelId;
    private BigDecimal creditLevel;
    private Long idTypeId;
    private String idType;
    private Long stateId;
    private String state;
    private Long bankId;
    private String bank;
    private Long countryId;
    private String country;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
    private Long supervisorId;
}
