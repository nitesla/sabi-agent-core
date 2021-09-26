package com.sabi.agent.core.merchant_integration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RaveData {
    private String flwRef;
    private String orderRef;
    private String raveWalletApiTxRef;
    private String txRef;
}
