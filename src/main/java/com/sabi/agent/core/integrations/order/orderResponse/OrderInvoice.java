package com.sabi.agent.core.integrations.order.orderResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderInvoice {

    private int deliveryCharge;
    private int subTotal;
    private int serviceCharge;
    private int total;
}
