package com.sabi.agent.core.dto.agentDto.requestDto;

import com.sabi.agent.core.models.CreditLevel;
import com.sabi.agent.core.models.agentModel.AgentCategory;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class AgentDto {

    private Long id;
    @NotNull
    @NotEmpty
    private AgentCategory agentCategory;
    @NotNull
    @NotEmpty
    private String scope;
    private String referralCode;
    private Boolean isActive;
    private String address;
    @NotNull
    @NotEmpty
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
