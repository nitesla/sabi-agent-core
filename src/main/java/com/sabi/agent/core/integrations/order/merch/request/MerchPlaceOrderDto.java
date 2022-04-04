package com.sabi.agent.core.integrations.order.merch.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class MerchPlaceOrderDto {

    private boolean orderPlacedBy;
    private List<Product> products;
    private Long agentId;
    private Long merchantId;
    private OrderDelivery orderDelivery;
    private int paymentMethod;
    private String orderReferalCode;
    private int checkoutUserType;
    private String location;
    private String customerComment;
    private String refreshToken;

}
