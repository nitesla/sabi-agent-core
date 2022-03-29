package com.sabi.agent.core.integrations.order.merch.response;

import lombok.Data;

@Data
public class MerchOrderDelivery {
    private Long orderId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
    private String state;
    private String lga;
    private String email;
    private String city;
    private int deliveryOption;
    private String deliveryCompany;
    private Double deliveryCharge;
    private Double subTotal;
    private Double totalVAT;
    private Double serviceCharge;
    private Double total;
    private String partnerDeliveryCode;
}
