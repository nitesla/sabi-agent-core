package com.sabi.agent.core.integrations.order;

import lombok.Data;

@Data
public class Product {

    private int groupBuyBulkPrice;
    private String groupBuyId;
    private int groupBuySplitId;
    private String itemId;
    private int quantity;
}
