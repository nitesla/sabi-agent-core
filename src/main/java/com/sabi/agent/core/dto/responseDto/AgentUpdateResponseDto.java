package com.sabi.agent.core.dto.responseDto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgentUpdateResponseDto {

    private Long id;

    private Long agentCategoryId;
    private long userId;
    private String scope;
    private String referralCode;
    private Boolean isActive;
    private String address;
    private String bvn;
    private String agentType;
    private Long creditLimit;
    private Integer payBackDuration;
    private String comment;
    private String cardToken;
    private String status;
    private String walletId;
    private String picture;
    private Boolean hasCustomizedTarget;
    private Long creditLevelId;

}
