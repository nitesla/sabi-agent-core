package com.sabi.agent.core.integrations.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductData {

    private String id;
    private String name;
    private String slug;
    private String sku;
    private String description;
    private String branchId;
    private Images images;
    private String primaryCategory;
    private String categoryName;
    private String unitValue;
    private int minPrice;
    private int maxPrice;
    private List<BulkPriceData> bulkPrices;
    private int moq;
    private SingleProductCommission productCommission;
    private SingleProductQuantity quantity;
    private boolean isAvailable;


























}
