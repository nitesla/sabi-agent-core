package com.sabi.agent.core.integrations.order.merch.response;

import lombok.Data;

@Data
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
    private String isAvailable;
    private String email;
    private String categoryId;
    private String[] businessCategories;
    private String state;
    private ListingOptions listingOptions;
    private int branchPaymentOption;

}
