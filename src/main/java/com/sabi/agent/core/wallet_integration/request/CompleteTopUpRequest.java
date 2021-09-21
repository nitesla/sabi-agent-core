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
    @NotBlank(message = "code can not be empty")
    private String code;
    @NotBlank(message = "Linking reference can not be blank")
    private String linkingReference;
    @NotBlank(message = "message cannot be blank")
    private String message;
    @NotBlank(message = "Reference can not be blank")
    private String reference;
}
