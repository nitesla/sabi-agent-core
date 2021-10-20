package com.sabi.agent.core.wallet_integration.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InitiateTopUpRequest {
    //{
    //  "amount": 0,
    //  "callBackUrl": "string",
    //  "receiverPhoneNumber": "string"
    //}
    @DecimalMin(value = "0.0", message = "Amount can not be a negative value")
    private BigDecimal amount;
    @NotBlank(message = "Receiver phone number can not be empty")
    private String receiverPhoneNumber;
    @NotBlank(message = "Call back url can not be empty")
    private String callBackUrl;
}
