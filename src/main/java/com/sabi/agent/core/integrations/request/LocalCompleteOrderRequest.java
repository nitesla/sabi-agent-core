package com.sabi.agent.core.integrations.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LocalCompleteOrderRequest {
    @NotNull(message = "Response code is required")
    private  String code;
    @NotNull(message = "Payment Reference is required")
    private String paymentReference;
    @NotNull(message = "Linking Reference is required")
    private String linkReference;
    @NotNull(message = "Message is required")
    private String message;
//    @NotNull(message = "Order id is required")
//    private Long orderId;
    //todo confirm if redirect url is required
//    @NotBlank(message = "Redirect url is required")
//    @URL(message = "redirectUrl must be a valid URl")
//    private String redirectUrl;
}
