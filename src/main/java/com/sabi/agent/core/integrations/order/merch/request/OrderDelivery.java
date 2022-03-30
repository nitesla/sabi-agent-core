package com.sabi.agent.core.integrations.order.merch.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class OrderDelivery {
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
    private double deliveryCharge;
    private double subTotal;
    private double totalVAT;
    private double serviceCharge;
    private double total;
    private String partnerDeliveryCode;
}
