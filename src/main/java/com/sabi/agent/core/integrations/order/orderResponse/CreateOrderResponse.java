package com.sabi.agent.core.integrations.order.orderResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateOrderResponse {

    private boolean status;
    private String message;
    private ResponseData data;
}
