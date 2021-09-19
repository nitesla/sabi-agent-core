package com.sabi.agent.core.integrations.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderData {

    private int orderId;
    private Date orderDate;
    private String orderNumber;
    private int numberOfItems;
    private OrderDelivery orderDelivery;
    private Payment payment;
    private CustomerDetails customerDetails;
    private PaymentInfo paymentInfo;
    private List<OrderItem> orderItems;
    private PlacedBy placedBy;
    private List<Remittance> remittances;
    private int totalAmountPaid;
    private int totalUnpaidBalance;
    private FinancialDetails financialDetails;
}
