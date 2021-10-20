package com.sabi.agent.core.integrations;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MerchProduct {
    private String itemId;
    private String groupBuyId;
    private long quantity;
    private BigDecimal agentSellingPrice;
    private int commissionCategory;
    private double totalCommissionPercentage;
    private double agentCommissionPercentage;
    private double referalCommissionPercentage;
    private BigDecimal totalCommisionValue;
    private BigDecimal agentCommisionValue;
    private BigDecimal referralCommisionValue;
    private BigDecimal spacesCommisionValue;
}
