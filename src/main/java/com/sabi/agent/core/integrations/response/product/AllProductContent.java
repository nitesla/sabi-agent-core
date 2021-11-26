package com.sabi.agent.core.integrations.response.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AllProductContent {

    private String id;
    private String name;
    private String slug;
    private String sku;
    private String branchId;
    private AllProductImages images;
    private AllProductListingOptions listingOptions;
    private String primaryCategory;
    private double minPrice;
    private double maxPrice;
    private int moq;
    private int views;
    private AllProductCommission productCommission;
}
