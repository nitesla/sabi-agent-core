package com.sabi.agent.core.wallet_integration.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompleteTopUpResponse implements IWalletResponse{
    private BigDecimal amount;
    private BigDecimal balanceAfter;
    private BigDecimal balanceBefore;
    private BigDecimal chargeAmount;
    private String externalReference;
    private String internalReference;
    private BigDecimal totalAmount;
    private String transactionStatus;
    private String transactionType;
}
