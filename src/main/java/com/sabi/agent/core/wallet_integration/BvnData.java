package com.sabi.agent.core.wallet_integration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BvnData {
    private Data__1 data;
    private Meta meta;
    private String message;
    private boolean status;
}
