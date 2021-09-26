package com.sabi.agent.core.merchant_integration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MerchantLocation {
    private String address;
    private String city;
    private String latitude;
    private String localGovt;
    private String longitude;
    private String state;
}
