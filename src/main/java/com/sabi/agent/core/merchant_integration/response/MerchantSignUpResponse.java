package com.sabi.agent.core.merchant_integration.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MerchantSignUpResponse {
    //{"status":"FORBIDDEN",
    // "error":"PHONE_NOT_VALIDATED_BEFORE_SIGNUP",
    // "message":"Please validate your phone number before signing up."}
    //{"id":"205af63e-9111-40ce-9444-6d2e887239db",
    // "firstName":"Joy","lastName":"Jane",
    // "email":"teiii@gmaiul.com",
    // "phoneNumber":"+2349099118314",
    // "address":"Close 55, house 17, Sattelite , Lagos"}
    private String id;
    private String firstName;
    private String email;
    private String phoneNumber;
    private String lastName;
    private String address;
    private String status;
    private String error;
    private String message;
}
