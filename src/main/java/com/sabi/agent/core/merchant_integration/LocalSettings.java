package com.sabi.agent.core.merchant_integration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LocalSettings {
    private boolean hasInventory;
    private String localCreatedDate;
    private int localId;
    private String localModifiedDate;
    private String merchantId;
}
