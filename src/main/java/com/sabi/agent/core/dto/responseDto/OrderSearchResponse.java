package com.sabi.agent.core.dto.responseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderSearchResponse {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Long id;
    private boolean status;
    private Long orderId;
    //processing, paid, delivered, partial delivery
    private String orderStatus;
    private Date orderDate;
    private boolean isSentToThirdParty;
    private String thirdPartyResponseDesc;
    private String thirdPartyResponseCode;
    private String paymentMethod;
    private Long agentId;
    private String totalAmount;
    private Long merchantId;
    private String userName;
    private Date createdDate;
    private Long successPaymentId;
}
