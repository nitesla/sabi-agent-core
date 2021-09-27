package com.sabi.agent.core.merchant_integration.merchant_signup;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NextKinData {

    private String email;
    private String firstName;
    private String houseAddress;
    private String lastName;
    private String msisdn;
    private String relationShip;
}
