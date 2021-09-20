package com.sabi.agent.core.integrations.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductData {

    private String id;
    private String businessId;
    private Long merchantId;
    private String itemName;
    private BigDecimal itemPrice;
    private Long commission;
    private BigDecimal listingPrice;
    private Long salesRecordId;
    private String dateCreated;
    private String dateUpdated;
    private Boolean hasInvetory;
    private Boolean isDeleted;
    private String barCode;
    private BigDecimal costPrice;
    private Boolean hasInventory;
    private String itemDescription;
    private String businessName;
    private String merchantName;
    private Long localId;
    private String localCreatedDate;
    private String localModifiedDate;
    private String businesses;
    private String branch;
    private String imageUrl;
    private List<String> otherimageUrl;

    private String categoryId;
    private String categoryName;
    private int quantity;
    private String description;
    private int orderChannel;
    private String branchId;
    private String branchName;
    private String branchSlug;
    private String businessSlug;
    private String sku;
    private String unitValue;
    private String brand;
    private int minimumOrderQuantity;
    private Boolean isOnMerchBuy;
    private Boolean isOnMerchList;
    private String markUpPrice;
    private String branchLocation;
    private int weight;
    private ProductPrice price;
    private List<BulkPriceData> bulkPrices;

    private String allQuantity;
    private Boolean categoryDefaultCommission;
    private String branchPaymentOption;
    private int merchbuytotalcommission;
    private int merchbuyAgentCommission;
    private int merchbuyReferralCommission;


























}
