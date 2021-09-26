package com.sabi.agent.core.integrations.order;


import lombok.Data;

import java.util.List;

@Data
public class PlaceOrder {

    private int checkoutUserType;
    private String customerComment;
    private String location;
    private OrderDelivery orderDelivery;
    private List<Product> products;
}
