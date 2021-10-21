package com.sabi.agent.core.models;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class WalletEntity {

    @Id
    @GeneratedValue()
    private Long id;
    private BigDecimal balance;
    private String wId;
    private String thirdPartyUserId;
    private String fundingLink;
    private String phoneNumber;
    private BigDecimal totalCommissionEarned;
    private String status;
    private String walletType;
    private String walletUserId;
    @ApiModelProperty(hidden = true)
    private Date createdDate ;
}
