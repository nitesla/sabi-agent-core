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
    private Object productId;
    private String productName;
    private Object comments;
    private String businessId;
    private String businessName;
    private String branchLocation;
    private String branchId;
    private String branchName;
    private int orderId;
    private Object itemId;
    private int quantity;
    private int totalPrice;
    private int costPrice;
    private int itemPrice;
    private String orderItemNumber;
    private String price;
    private String imageUrl;
    private int orderItemStatus;
    private int orderCancelledReason;
    private int settlementAmount;
    private int settlementStatus;
    private Object settlementUpdatedBy;
    private Object settlementDate;
    private String settlementDescription;
    private Object comment;
    private Object modifiedBy;
    private int packedQuantity;
    private String orderItemStatusDesc;
    private Object groupBuyId;
    private Object deliveryStatus;
    private Object deliveryStatus_apiResponse;
    private Object deliveryOrderNumbers;
    private Object deliveryWaybillNumbers;
    private int deliveryfee;
    private int weight;
    private Object groupBuyStatus;
    private Object groupBuyOrganiserName;
    private Object groupBuyOrganiserPhoneNumber;
    private Object inviteeEmail;
    private Object inviteePhonenumber;
    private int totalCommissionPercentage;
    private int agentCommissionPercentage;
    private int referalCommissionPercentage;
    private int totalCommisionValue;
    private int agentCommisionValue;
    private int referralCommisionValue;
    private int spacesCommisionValue;
    private int commissionCategory;
    private Object groupBuyCancellationReason;
    private String commissionCategoryDesc;
    private int orderItemHistoryId;
    private int orderItemStatusQuantity;
}
