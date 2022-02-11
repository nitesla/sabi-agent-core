package com.sabi.agent.core.integrations.order;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderData {
    private int orderId;
    private String orderDate;
    private String orderNumber;
    private int numberOfItems;
    private OrderDelivery orderDelivery;
    private Object payment;
    private CustomerDetails customerDetails;
    private PaymentInfo paymentInfo;
    private List<OrderItem> orderItems;
    private PlacedBy placedBy;
    private List<Object> remittances;
    private int totalAmountPaid;
    private int totalUnpaidBalance;
    private FinancialDetails financialDetails;
    private String orderStatus;
    private Long LocalOrderId;
}
