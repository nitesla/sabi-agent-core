package com.sabi.agent.core.dto.requestDto;

import com.sabi.framework.integrations.payment_integration.models.request.TokenisationRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CardTokenizationRequest {
    @NotNull(message = "Agent Id is required")
    private Long agentId;
    private TokenisationRequest tokenisationRequest;
}
