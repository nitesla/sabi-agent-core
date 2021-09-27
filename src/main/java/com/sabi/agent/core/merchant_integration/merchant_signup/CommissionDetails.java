package com.sabi.agent.core.merchant_integration.merchant_signup;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommissionDetails {
    private String commissionSource;
    private String generatedByOrderNumber;
    private String generatedByUserID;
    private String status;
}
