package com.sabi.agent.core.integrations.request;

import com.sabi.agent.core.integrations.response.Payment;

public class CompleteOrderRequest {

    private Integer orderId;
    private String partnerCode;
    private Payment payment;
    private String referralCode;
}
