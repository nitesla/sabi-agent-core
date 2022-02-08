package com.sabi.agent.core.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class AgentOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
