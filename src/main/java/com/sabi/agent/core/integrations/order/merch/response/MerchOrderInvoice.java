package com.sabi.agent.core.integrations.order.merch.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MerchOrderInvoice {

    private BigDecimal deliveryCharge;
    private BigDecimal subTotal;
    private BigDecimal serviceCharge;
    private BigDecimal total;
}
