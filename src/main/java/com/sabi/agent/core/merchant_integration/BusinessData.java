package com.sabi.agent.core.merchant_integration;

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
    private List<String> businessCategories;
    private String businessName;
    private String businessPhoneNumber;
    private String deliveryInstruction;
    private String email;
    private String lga;
    private String password;
    private String referralCode;
    private String shopNumber;
    private String state;
    private String streetAddress;
}
