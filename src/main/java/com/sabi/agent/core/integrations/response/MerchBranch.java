package com.sabi.agent.core.integrations.response;

import com.sabi.agent.core.merchant_integration.merchant_signup.ListingOptions;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MerchBranch {
    private String id;
    private String businessName;
    private String slug;
    private String businessSlug;
    private String name;
    private String businessId;
    private String location;
    private String openingHour;
    private String closingHour;
    private String phoneNumber;
    private String imageUrl;
    private String latitude;
    private String longitude;
    private String address;
    private boolean isAvailable;
    private String email;
    private String categoryId;
    private List<String> businessCategories ;
    private String state;
    private ListingOptions listingOptions;
    private int branchPaymentOption;
}
