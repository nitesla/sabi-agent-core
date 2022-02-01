package com.sabi.agent.core.integrations.order.orderResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompleteOrderResponse {
    private boolean status;
    private String message;
    private ResponseData data;
}
