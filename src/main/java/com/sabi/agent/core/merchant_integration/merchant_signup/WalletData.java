package com.sabi.agent.core.merchant_integration.merchant_signup;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WalletData {
    @JsonProperty("account_type")
    private String accountType;
    @JsonProperty("available_balance")
    private BigDecimal availableBalance;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("customer_id")
    private String customerId;
    @JsonProperty("date_balance_updated")
    private String dateBalanceUpdated;
    @JsonProperty("date_created")
    private String dateCreated;
    @JsonProperty("id")
    private String id;
    @JsonProperty("ledger_balance")
    private int ledgerBalance;
    @JsonProperty("status")
    private String status;
    @JsonProperty("wallet_number")
    private String walletNumber;
}
