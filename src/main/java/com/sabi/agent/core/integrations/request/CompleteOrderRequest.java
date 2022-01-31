package com.sabi.agent.core.integrations.request;

import com.sabi.agent.core.integrations.response.Payment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompleteOrderRequest {

    private Integer orderId;
    private String partnerCode;
    private Payment payment;
    private String referralCode;
}
