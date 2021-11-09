package com.sabi.agent.core.wallet_integration.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WalletBvnRequest {
    //{
    //  "accountNumber": "0035001514",
    //  "bankCode": "string",
    //  "bvn": "22318961125",
    //  "firstName": "Kelechi",
    //  "lastName": "Atuma",
    //  "phoneNumber": "08139385052"
    //}

    private Long agentId;
    @NotBlank(message = "Account Number Can not be blank")
    private String accountNumber;
    private String bankCode;
    @NotBlank(message = "Bvn Can not be blank")
    private String bvn;
    @NotBlank(message = "First Name Can not be blank")
    private String  firstName;
    @NotBlank(message = "Last Name Can not be blank")
    private String lastName;
    @NotBlank(message = "Phone Number Can not be blank")
    private String phoneNumber;
    @NotNull(message = "Agent Id can not be null")
    private Long agentId;
}
