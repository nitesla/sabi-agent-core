package com.sabi.agent.core.merchant_integration;

import com.sabi.agent.core.merchant_integration.merchant_signup.Cordinates;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AgentCustomer {
    private String city;
    private Cordinates cordinates;
    private String customerId;
    private String deliveryInstructions;
    private String firstName;
    private String lastName;
    private String lga;
    private String middleName;
    private String phoneNumber;
    private String shopAddress;
    private String shopNumber;
    private String state;
}
