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
public class MerchPlaceOrder {
    private boolean orderPlacedBy;
    private List<Product> products;
    private MerchCustomerDetails customerDetails;
    private int channel;
    private OrderDelivery orderDelivery;
    private String orderReferalCode;
    private int checkoutUserType;
    private String location;
    private String customerComment;
    private String refreshToken;
    private AgentCommissionInfo agentCommissionInfo;
}
