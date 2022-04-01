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

    private String buildingName;
    private String businessName;
    private String communityName;
    private String country;
    private String createdBy;
    private String createdDate;
    private String deliveryInstruction;
    private String countryCode;
    private String direction;
    private String email;
    private String firstName;
    private String lastName;
    private int latitude;
    private String lga;
    private int longitude;
    private String msisdn;
    private String nearestLandmark;
    private String otherNames;
    private String password;
    private String phoneNumber;
    private String referralCode;
    private String registeredBy;
    private String registrationChannel;
    private String shopNumber;
    private String state;
    private String streetAddress;
    private String streetName;
    private String streetNumber;
    private String userTitle;

    private String username;
    private String businessPhoneNumber;
    private Long agentId;
}
