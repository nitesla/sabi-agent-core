package com.sabi.agent.core.wallet_integration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WalletTransactionContent {
    private String accountNumber;
    private String bankName;
    private String confirmedDate;
    private String createdDate;
    private BigDecimal currentBalance;
    private String description;
    private BigDecimal finalBalance;
    private String receiverName;
    private String receiverPhoneNumber;
    private String senderName;
    private String senderPhoneNumber;
    private BigDecimal startingBalance;
    private BigDecimal transactionAmount;
    private BigDecimal transactionCharge;
    private String transactionClass;
    private String transactionReference;
    private String transactionStatus;
    private String transactionType;
    private String uniqueReference;
}
