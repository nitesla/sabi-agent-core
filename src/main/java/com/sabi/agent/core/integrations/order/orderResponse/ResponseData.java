package com.sabi.agent.core.integrations.order.orderResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseData {

    private CreateOrderDelivery orderDelivery;
    private Object payment;
    private Object branch;
    private List<OrderInvoice> orderInvoices;
    private int id;
    private Object userId;
    private String userName;
    private String email;
    private String phoneNumber;
    private String orderNumber;
    private String location;
    private Object deliveryState;
    private Object deliveryPackageReference;
    private Object placedFor;
    private Object pickupPackageReference;
    private int totalPrice;
    private int subTotal;
    private int serviceFee;
    private int deliveryFee;
    private int noOfItems;
    private String createdDate;
    private int orderStatus;
    private int fulfilmentStatus;
    private List<CreateOrderItem> orderItems;
    private Object admincomments;
    private Object customercomments;
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
    private Object paymentMethodDescription;
    private boolean isNewCustomer;
    private int orderFlag;
}
