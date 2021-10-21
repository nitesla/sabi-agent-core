package com.sabi.agent.core.wallet_integration.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WalletSignUpRequest {
    //{
    //  "email": "string",
    //  "firstName": "string",
    //  "hash": "string",
    //  "lastName": "string",
    //  "middleName": "string",
    //  "phoneNumber": "string",
    //  "publicKey": "string",
    //  "thirdPartyUserId": "string"
    //}
//    @Email(message = "Enter  a valid email")
    private String email;
//    @NotBlank(message = "First name can not be blank")
    private String firstName;
//    @NotBlank(message = "Last name can not be blank")
    private String lastName;
//    @NotBlank(message = "Middle name can not be blank")
    private String middleName;
//    @NotBlank(message = "phone Number can not  be blank")
    private String phoneNumber;
//    @NotBlank(message = "User Id can not be blank")
    private String thirdPartyUserId;
}
