package com.sabi.agent.core.dto.agentDto.requestDto;


import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class AgentUpdateDto {

    private Long id;

    private long userId;
    private Long agentCategoryId;
    private String scope;
    private String referralCode;
    private String referrer;
    private String address;
    private String bvn;
    private String agentType;
    private Long creditLimit;
    private Integer payBackDuration;
    private Long balance;
    private Date verificationDate;
    private Long supervisorId;
    private String comment;
    private String cardToken;
    private String walletId;
    private String picture;
    private Boolean hasCustomizedTarget;
    private Long creditLevelId;
    private Long idTypeId;
    private Long stateId;
    private Long bankId;
    private Long countryId;
    private boolean accountNonLocked;

}
