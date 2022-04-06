package com.sabi.agent.core.integrations.order.merch.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class MerchPlaceOrderDto {

    private boolean orderPlacedBy;
    private List<Product> products;
    @NotNull(message = "Agent Id is required")
    private Long agentId;
    @NotNull(message = "Merchant Id is required")
    private Long merchantId;
    private OrderDelivery orderDelivery;
    @NotNull(message = "Payment method is required")
    private Integer paymentMethod;
    private String orderReferalCode;
    private int checkoutUserType;
    private String location;
    private String customerComment;
    private BigDecimal profit;
    private String refreshToken;

}
