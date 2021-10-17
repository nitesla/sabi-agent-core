package com.sabi.agent.core.models.agentModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Transient;
import java.util.Date;





@EqualsAndHashCode(callSuper=false)
@Entity
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Agent extends CoreEntity {

    @Column(updatable= false)
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
    private int verificationStatus;
    private String comment;
    private String cardToken;
    private int status;
    private String walletId;
    private String picture;
    private Boolean hasCustomizedTarget;
    private Long creditLevelId;
    private Long idTypeId;
    private String idCard;
    private Long stateId;
    private Long bankId;
    private Long countryId;
    private boolean accountNonLocked;
    private String registrationToken;
    private String registrationTokenExpiration;
    private Boolean isEmailVerified ;
    private String countryCode;
    private double commission;

    @Transient
    private String firstName;
    @Transient
    private String lastName;
    @Transient
    private String phone;
    @Transient
    private String email;
    @Transient
    private String agentCategoryName;




}
