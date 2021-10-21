package com.sabi.agent.core.integrations.order;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class PlaceOrder {

    private int checkoutUserType;
    private String customerComment;
    private String location;
    private OrderDelivery orderDelivery;
    private List<Product> products;
    private Long agentId;
}
