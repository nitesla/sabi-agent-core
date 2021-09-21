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
public class TransactionLineItems {

    private BigDecimal amount;
    private String externalTransactionReference;
    private String internalTransactionReference;
    private String receiverAccountNumber;
    private String receiverBank;
    private String receiverName;
    private String receiverWalletId;
    private String senderName;
    private String senderWalletId;
    private String transactionStatus;
    private String transactionSubType;
}
