package com.sabi.agent.core.wallet_integration.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompleteTopUpRequest {
    private String code;
    @NotBlank(message = "Linking reference can not be blank")
    private String linkingReference;
    private String message;
    @NotBlank(message = "Reference can not be blank")
    private String reference;
}
