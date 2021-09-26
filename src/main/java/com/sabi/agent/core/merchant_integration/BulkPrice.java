package com.sabi.agent.core.merchant_integration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BulkPrice {
    private BigDecimal moq;
    private BigDecimal price;
}
