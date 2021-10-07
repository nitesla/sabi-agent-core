package com.sabi.agent.core.merchant_integration.merchant_signup;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MerchAppData {
    private AccountDetails accountDetails;
    private String available;
    private String branchId;
    private List<String> businessCategories;
    private List<String> businessCategoryNames;
    private String businessId;
    private String businessSlug;
    private Details__1 details;
    private UUID id;
    private String imageUrl;
    private ListingOptions listingOptions;
    private MerchantLocation location;
    private String merchantId;
    private String name;
    private String paymentOption;
    private String productCategories;
    private String slug;
}
