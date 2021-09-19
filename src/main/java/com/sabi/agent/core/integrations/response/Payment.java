package com.sabi.agent.core.integrations.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Payment {

    private String redirecturl;
    private String transactionId;
    private String transactionReference;
    private String reference;
    private String status;
    private String message;
    private String response;
    private int paymentMethod;
    private String responseString;
    private int deliveryCharge;
    private int subTotal;
    private int serviceCharge;
    private int total;
    private String email;
    private String paymentMethodDescription;
}
