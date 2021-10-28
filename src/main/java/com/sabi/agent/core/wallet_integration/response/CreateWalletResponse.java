package com.sabi.agent.core.wallet_integration.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateWalletResponse implements IWalletResponse{
    //{
    //  "applicationName": "string",
    //  "balance": 0,
    //  "fundingLink": "string",
    //  "id": "string",
    //  "status": "ACTIVE",
    //  "thirdPartyUserId": "string",
    //  "totalCommissionEarned": 0,
    //  "walletType": "USER",
    //  "walletUserId": "string"
    //}

    private BigDecimal balance;
    @JsonProperty("id")
    private String wId;
    private String thirdPartyUserId;
    private String fundingLink;
    private String phoneNumber;
    private BigDecimal totalCommissionEarned;
    private String status;
    private String walletType;
    private String walletUserId;
}
