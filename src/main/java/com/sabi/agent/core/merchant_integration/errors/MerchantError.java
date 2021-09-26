package com.sabi.agent.core.merchant_integration.errors;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MerchantError {
    private String status;
    private String error;
    private String message;
}
