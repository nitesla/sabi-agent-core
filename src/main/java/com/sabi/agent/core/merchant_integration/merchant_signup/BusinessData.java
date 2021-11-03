package com.sabi.agent.core.merchant_integration.merchant_signup;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BusinessData {
    private String businessName;
    private String streetAddress;
    private String state;
    private String lga;
    private String email;
    private String businessPhoneNumber;
    private List<Object> businessCategories;
}
