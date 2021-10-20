package com.sabi.agent.core.integrations.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MerchBuyResponse {
    private boolean status;
    private String message;
    private MerchBuyData data;
}
