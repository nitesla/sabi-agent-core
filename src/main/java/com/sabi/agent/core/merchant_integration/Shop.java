package com.sabi.agent.core.merchant_integration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Shop {
    private Details details;
    private String id;
    private MerchAppData merchAppData;
    private List<Product> products;
    private String state;
}
