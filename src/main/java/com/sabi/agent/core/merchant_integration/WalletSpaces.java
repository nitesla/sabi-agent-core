package com.sabi.agent.core.merchant_integration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WalletSpaces {
    private BigDecimal balance;
    private List<BankAccount> bankAccounts;
    private List<Card> cards;
    private String createdAt;
    private String id;
    private String status;
    private List<Transaction> transactions ;
    private String updatedAt;
}
