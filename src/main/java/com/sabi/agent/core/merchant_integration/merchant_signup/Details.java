package com.sabi.agent.core.merchant_integration.merchant_signup;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Details {
    private List<String> businessCategories;
    private String businessPhoneNumber;
    private String countryState;
    private String dynamicLink;
    private String email;
    private boolean isPhoneRegisteredOnWhatsApp;
    private String lga;
    private String shopName;
    private String streetAddress;
}
