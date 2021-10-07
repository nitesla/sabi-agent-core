package com.sabi.agent.core.merchant_integration.merchant_signup;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankAccount {
    private BankAccountData bankAccountData;
    private String createdAt;
    private UUID id;
    private String updatedAt;
}
