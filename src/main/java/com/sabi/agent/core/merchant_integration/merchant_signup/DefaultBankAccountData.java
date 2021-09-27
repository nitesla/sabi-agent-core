package com.sabi.agent.core.merchant_integration.merchant_signup;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DefaultBankAccountData {
    private String accountNumber;
    private String accountOwnerName;
    private String bankCode;
    private String bankName;
    private String currency;
}
