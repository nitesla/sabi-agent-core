package com.sabi.agent.core.merchant_integration.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MerchantSignUpRequest {
    private List<String> businessCategories;
    private String businessName;
    private String country;
    private String deliveryInstruction;
    private String email;
    private String firstName;
    private String lastName;
    private String lga;
    private String msisdn;
    private String password;
    private String phoneNumber;
    private String referralCode;
    private String shopNumber;
    private String state;
    private String streetAddress;
    private String username;
}
