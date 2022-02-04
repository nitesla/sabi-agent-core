package com.sabi.agent.core.integrations.response;

import com.sabi.agent.core.models.AgentOrder;
import com.sabi.framework.integrations.payment_integration.models.response.PaymentStatusResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LocalCompleteOrderResponse {
    private PaymentStatusResponse paymentStatus;
    private AgentOrder order;
}
