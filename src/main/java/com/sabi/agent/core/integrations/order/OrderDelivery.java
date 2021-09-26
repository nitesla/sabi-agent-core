package com.sabi.agent.core.integrations.order;

import lombok.Data;

@Data
public class OrderDelivery {
    private String address;
    private int deliveryCharge;
    private String deliveryCompany;
    private int deliveryOption;
    private String firstName;
    private String lastName;
    private String lga;
    private String partnerDeliveryCode;
    private String phoneNumber;
    private String provider;
    private int serviceCharge;
    private String state;
    private int subTotal;
    private int total;
}
