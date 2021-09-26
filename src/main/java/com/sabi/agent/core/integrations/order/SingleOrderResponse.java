package com.sabi.agent.core.integrations.order;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SingleOrderResponse {

    private String status;
    private String message;
    private OrderData data;
}
