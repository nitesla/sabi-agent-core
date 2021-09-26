package com.sabi.agent.core.merchant_integration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BvnValidationData {
    private String bvnId;
    private String otpCode;
    private boolean validated;
}
