package com.sabi.agent.core.integrations.order.merch.response;

import lombok.Data;

import java.util.List;

@Data
public class MerchData {
    private MerchOrderDelivery orderDelivery;
    private MerchPayment payment;
    private MerchBranch branch;
    private List<MerchOrderInvoice> orderInvoices;
    private Long id;
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
    private Double serviceFee;
    private Double deliveryFee;
    private int noOfItems;
    private String createdDate;
    private int orderStatus;
    private int fulfilmentStatus;
    private List<MerchOrderItem> orderItems;
    private List<MerchComment> admincomments;
    private List<MerchComment> customercomments;
    private String deliveryNote;
    private String partnerReference;
    private String orderInvoice;
    private String orderCancelledReason;
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
