package com.sabi.agent.core.integrations.order.orderResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateOrderItem {

    private int id;
    private String productId;
    private String productName;
    private String comments;
    private String businessId;
    private String businessName;
    private String branchLocation;
    private String branchId;
    private String branchName;
    private int orderId;
    private String itemId;
    private int quantity;
    private String totalPrice;
    private String costPrice;
    private String itemPrice;
    private String orderItemNumber;
    private String price;
    private String imageUrl;
    private int orderItemStatus;
    private int orderCancelledReason;
    private int settlementAmount;
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
    private int deliveryfee;
    private int weight;
    private String groupBuyStatus;
    private String groupBuyOrganiserName;
    private String groupBuyOrganiserPhoneNumber;
    private String inviteeEmail;
    private String inviteePhonenumber;
    private int totalCommissionPercentage;
    private int agentCommissionPercentage;
    private int referalCommissionPercentage;
    private int totalCommisionValue;
    private int agentCommisionValue;
    private int referralCommisionValue;
    private int spacesCommisionValue;
    private int commissionCategory;
    private String groupBuyCancellationReason;
    private String commissionCategoryDesc;
    private int orderItemHistoryId;
    private int orderItemStatusQuantity;
}
