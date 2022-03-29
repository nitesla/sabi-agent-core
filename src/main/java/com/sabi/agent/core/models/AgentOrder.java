package com.sabi.agent.core.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
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
    @Transient
    private String merchantName;
    private String userName;
    private BigDecimal paidAmount;
    private Date createdDate;
    private Long successPaymentId;
}
