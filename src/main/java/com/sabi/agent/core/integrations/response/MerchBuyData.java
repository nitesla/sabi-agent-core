package com.sabi.agent.core.integrations.response;

import com.sabi.agent.core.integrations.order.orderResponse.OrderInvoice;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MerchBuyData {
    private OrderDelivery orderDelivery;
    private Payment payment;
    private MerchBranch branch;
    private List<OrderInvoice> orderInvoices = null;
    private long id;
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
    private BigDecimal totalPrice;
    private BigDecimal subTotal;
    private BigDecimal serviceFee;
    private BigDecimal deliveryFee;
    private BigDecimal noOfItems;
    private String createdDate;
    private int orderStatus;
    private int fulfilmentStatus;
    private List<OrderItem> orderItems;
    private List<Admincomment> admincomments;
    private List<Customercomment> customercomments;
    private String partnerReference;
    private String orderInvoice;
    private int orderCancelledReason;
    private String orderReferalCode;
    private long packedCount;
    private long deliveredCount;
    private long cancelledCount;
    private long orderChannel;
    private boolean hasGroupBuyOrderItem;
    private int agentComissionType;
    private String agentUserId;
    private String agentPhoneNumber;
    private boolean orderPlacedBy;
    private String transactionReference;
    private int paymentMethod;
    private String paymentMethodDescription;
    private int isNewCustomer;
    private int orderFlag;
}
