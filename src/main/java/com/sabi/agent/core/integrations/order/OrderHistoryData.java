package com.sabi.agent.core.integrations.order;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderHistoryData {
    private int id;
    private Object userId;
    private String userName;
    private String email;
    private String phoneNumber;
    private String orderNumber;
    private String location;
    private String deliveryState;
    private Object deliveryPackageReference;
    private String placedFor;
    private Object pickupPackageReference;
    private double totalPrice;
    private int subTotal;
    private int serviceFee;
    private int deliveryFee;
    private int noOfItems;
    private String createdDate;
    private int orderStatus;
    private int fulfilmentStatus;
    private Object orderItems;
    private List<Object> admincomments;
    private List<Object> customercomments;
    private Object partnerReference;
    private Object orderInvoice;
    private int orderCancelledReason;
    private Object orderReferalCode;
    private int packedCount;
    private int deliveredCount;
    private int cancelledCount;
    private int orderChannel;
    private boolean hasGroupBuyOrderItem;
    private int agentComissionType;
    private String agentUserId;
    private String agentPhoneNumber;
    private boolean orderPlacedBy;
    private Object transactionReference;
    private int paymentMethod;
    private String paymentMethodDescription;
    private boolean isNewCustomer;
    private int orderFlag;
}
