package com.sabi.agent.core.models.agentModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sabi.agent.core.models.CreditLevel;
import com.sabi.agent.core.models.Supervisor;
import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import java.util.Date;


@EqualsAndHashCode(callSuper=false)
@Entity
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Agent extends CoreEntity {

    private long userId;
    private AgentCategory agentCategory;
    private String scope;
    private String referralCode;
    private Boolean isActive;
    private String address;
    private String bvn;
    private String agentType;
    private Long creditLimit;
    private Integer payBackDuration;
    private Long balance;
    private Date verificationDate;
    private Supervisor supervisor;
    private String verificationStatus;
    private String comment;
    private String cardToken;
    private String status;
    private String walletId;
    private String picture;
    private String registrationToken;
    private Date getRegistrationTokenExpiration;
    private Boolean hasCustomizedTarget;
    private CreditLevel creditLevel;

    private boolean accountNonLocked;
}
