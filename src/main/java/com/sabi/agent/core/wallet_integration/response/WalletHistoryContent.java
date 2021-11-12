package com.sabi.agent.core.wallet_integration.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WalletHistoryContent {
    @JsonProperty("transactionClass")
    private String transactionClass;
    @JsonProperty("transactionType")
    private String transactionType;
    @JsonProperty("transactionAmount")
    private Integer transactionAmount;
    @JsonProperty("transactionReference")
    private String transactionReference;
    @JsonProperty("receiverName")
    private String receiverName;
    @JsonProperty("currentBalance")
    private Integer currentBalance;
    @JsonProperty("senderName")
    private String senderName;
    @JsonProperty("transactionCharge")
    private Integer transactionCharge;
    @JsonProperty("transactionStatus")
    private String transactionStatus;
    @JsonProperty("createdDate")
    private String createdDate;
}
