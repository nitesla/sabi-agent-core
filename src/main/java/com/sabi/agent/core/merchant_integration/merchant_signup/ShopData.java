package com.sabi.agent.core.merchant_integration.merchant_signup;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ShopData {
    private String lga;
    private String email;
    private String shopName;
    private String dynamicLink;
    private String countryState;
    private String streetAddress;
    private List<String> businessCategories = null;
    private String businessPhoneNumber;
    private Object isPhoneRegisteredOnWhatsApp;
}
