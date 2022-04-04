package com.sabi.agent.core.integrations.order.merch.response;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class MerchPayment {
    private String redirecturl;
    private String transactionId;
    private String transactionReference;
    private String reference;
    private String status;
    private String message;
    private String response;
    private int paymentMethod;
    private String responseString;
    private BigDecimal deliveryCharge;
    private BigDecimal subTotal;
    private BigDecimal serviceCharge;
    private BigDecimal total;
    private String email;
    private String paymentMethodDescription;
}
