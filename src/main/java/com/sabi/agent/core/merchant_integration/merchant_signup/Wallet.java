package com.sabi.agent.core.merchant_integration.merchant_signup;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Wallet {
    @JsonProperty("account_type")
    private String accountType;
    @JsonProperty("available_balance")
    private int availableBalance;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("customer_id")
    private String customerId;
    @JsonProperty("date_balance_updated")
    private String dateBalanceUpdated;
    @JsonProperty("date_created")
    private String dateCreated;
    @JsonProperty("id")
    private UUID id;
    @JsonProperty("ledger_balance")
    private BigDecimal ledgerBalance;
    @JsonProperty("status")
    private String status;
    @JsonProperty("wallet_number")
    private String walletNumber;
}
