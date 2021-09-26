package com.sabi.agent.core.merchant_integration.merchant_signup;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductCommission {
    private boolean categoryDefault;
    private String merchbuyAgentCommission;
    private String merchbuyReferralCommission;
    @JsonProperty("merchbuytotalcommission")
    private String merchBuyTotalCommission;
}
