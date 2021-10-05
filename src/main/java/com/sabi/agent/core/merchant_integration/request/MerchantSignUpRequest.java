package com.sabi.agent.core.merchant_integration.request;

import com.sabi.agent.core.merchant_integration.AgentCustomer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MerchantSignUpRequest {
    private AgentCustomer agentCustomer;
    private List<String> businessCategories;
    private String country;
    private String deliveryInstruction;
    private String firstName;
    private String lastName;
    private String lga;
    private String msisdn;
    private String phoneNumber;
    private String referralCode;
    private String shopAddress;
    private String shopNumber;
    private String state;
    private String username;
}
