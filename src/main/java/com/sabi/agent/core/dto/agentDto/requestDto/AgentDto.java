package com.sabi.agent.core.dto.agentDto.requestDto;

import com.sabi.agent.core.models.CreditLevel;
import com.sabi.agent.core.models.agentModel.AgentCategory;
import lombok.Data;

@Data
public class AgentDto {

    private Long id;

    private AgentCategory agentCategory;

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
    private CreditLevel creditLevel;

}
