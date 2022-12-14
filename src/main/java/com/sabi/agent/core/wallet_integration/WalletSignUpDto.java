package com.sabi.agent.core.wallet_integration;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class WalletSignUpDto {
    private String email;
    private String firstName;
    private String hash;
    private String lastName;
    private String middleName;
    private String phoneNumber;
    private String publicKey;
    private String thirdPartyUserId;
}
