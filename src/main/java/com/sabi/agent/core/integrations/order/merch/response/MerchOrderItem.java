package com.sabi.agent.core.integrations.order.merch.response;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class MerchOrderItem {
    private Long id;
    private String productId;
    private String productName;
    private List<MerchComment> comments;
    private String businessId;
    private String businessName;
    private String branchLocation;
    private String branchId;
    private String branchName;
    private Long orderId;
    private String itemId;
    private int quantity;
    private BigDecimal totalPrice;
    private BigDecimal costPrice;
    private BigDecimal itemPrice;
    private String orderItemNumber;
    private String price;
    private String imageUrl;
    private int orderItemStatus;
    private int orderCancelledReason;
    private BigDecimal settlementAmount;
    private int settlementStatus;
    private String settlementUpdatedBy;
    private String settlementDate;
    private String settlementDescription;
    private String comment;
    private String modifiedBy;
    private int packedQuantity;
    private String orderItemStatusDesc;
    private String groupBuyId;
    private String deliveryStatus;
    private String deliveryStatus_apiResponse;
    private String deliveryOrderNumbers;
    private String deliveryWaybillNumbers;
    private BigDecimal deliveryfee;
    private Double weight;
    private String groupBuyStatus;
    private String groupBuyOrganiserName;
    private String groupBuyOrganiserPhoneNumber;
    private String inviteeEmail;
    private String inviteePhonenumber;
    private Double totalCommissionPercentage;
    private Double agentCommissionPercentage;
    private Double referalCommissionPercentage;
    private Double totalCommisionValue;
    private Double agentCommisionValue;
    private Double referralCommisionValue;
    private Double spacesCommisionValue;
    private int commissionCategory;
    private String groupBuyCancellationReason;
    private String commissionCategoryDesc;
    private Long orderItemHistoryId;
    private int orderItemStatusQuantity;

}
