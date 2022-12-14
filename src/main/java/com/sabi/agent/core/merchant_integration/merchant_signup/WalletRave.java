package com.sabi.agent.core.merchant_integration.merchant_signup;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WalletRave {
    private List<BankAccount> bankAccounts;
    private List<Card> cards;
    private String createdAt;
    private CustomerData customerData;
    private UUID id;
    private String status;
    private List<Transaction> transactions;
    private String updatedAt;
    private WalletData walletData;
}
