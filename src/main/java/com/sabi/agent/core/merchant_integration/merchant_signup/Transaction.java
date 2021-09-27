package com.sabi.agent.core.merchant_integration.merchant_signup;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    private BigDecimal amount;
    private CommissionDetails commissionDetails;
    private String createdAt;
    private String details;
    private String id;
    private OrderDetails orderDetails;
    private RaveData raveData;
    private String status;
    private String type;
    private String updatedAt;
}
