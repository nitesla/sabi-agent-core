package com.sabi.agent.core.integrations.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDelivery {
    private int orderId;
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
    private int deliveryCharge;
    private int subTotal;
    private int serviceCharge;
    private int total;
    private String partnerDeliveryCode;
}
