package com.sabi.agent.core.integrations.order.merch.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Product {
    private String itemId;
    private String groupBuyId;
    private int quantity;
    private int vat;
    private double agentSellingPrice;
    private int commissionCategory;
    private double totalCommissionPercentage;
    private double agentCommissionPercentage;
    private double referalCommissionPercentage;
    private double totalCommisionValue;
    private double agentCommisionValue;
    private double referralCommisionValue;
    private double spacesCommisionValue;
}
