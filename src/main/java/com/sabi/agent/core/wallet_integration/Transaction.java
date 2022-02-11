package com.sabi.agent.core.wallet_integration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Transaction {
    private BigDecimal amount;
    private String internalTransactionReference;
    private String senderPhoneNumber;
    private List<TransactionLineItems> transactionLineItems;
    private String transactionStatus;
    private String transactionType;
}
