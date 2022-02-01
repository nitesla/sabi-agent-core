package com.sabi.agent.core.integrations.order.orderResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseData {

    private CreateOrderDelivery orderDelivery;
    private String payment;
    private String branch;
    private List<OrderInvoice> orderInvoices;
    private int id;
    private String userId;
    private String userName;
    private String email;
    private String phoneNumber;
    private String orderNumber;
    private String location;
    private String deliveryState;
    private String deliveryPackageReference;
    private String placedFor;
    private String pickupPackageReference;
    private int totalPrice;
    private int subTotal;
    private int serviceFee;
    private int deliveryFee;
    private int noOfItems;
    private String createdDate;
    private int orderStatus;
    private int fulfilmentStatus;
    private List<CreateOrderItem> orderItems;
    private String admincomments;
    private String customercomments;
    private String partnerReference;
    private String orderInvoice;
    private int orderCancelledReason;
    private String orderReferalCode;
    private int packedCount;
    private int deliveredCount;
    private int cancelledCount;
    private int orderChannel;
    private boolean hasGroupBuyOrderItem;
    private int agentComissionType;
    private String agentUserId;
    private String agentPhoneNumber;
    private boolean orderPlacedBy;
    private String transactionReference;
    private int paymentMethod;
    private String paymentMethodDescription;
    private boolean isNewCustomer;
    private int orderFlag;
}
