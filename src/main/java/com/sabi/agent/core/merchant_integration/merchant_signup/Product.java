package com.sabi.agent.core.merchant_integration.merchant_signup;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    private boolean availableAtRetailPrice;
    private boolean availableAtWholesalePrice;
    private String base64ProductImageString;
    private List<BulkPrice> bulkPrices;
    private String category;
    private BigDecimal costPrice;
    private String createdAt;
    private String createdBy;
    private String description;
    private String id;
    private Images images;
    private String inventoryProductId;
    private ListingOptions listingOptions;
    //    private int localCreatedDate;
//    private int localModifiedDate;
    private String localCreatedDate;
    private String localModifiedDate;
    private LocalSettings localSettings;
    private String merchAppId;
    private BigDecimal moq;
    private String name;
    private List<String> otherImagesBase64String;
    private ProductCommission productCommission;
    private int quantity;
    private BigDecimal retailUnitPrice;
    private String sku;
    private String unit;
    private String updatedAt;
    private String updatedBy;
    private BigDecimal wholesaleUnitPrice;
}
