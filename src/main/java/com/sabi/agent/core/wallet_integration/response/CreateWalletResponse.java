package com.sabi.agent.core.wallet_integration.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class CreateWalletResponse implements IWalletResponse{
    private BigDecimal balance;
    private String firstName;
    private String fundingLink;
    private String lastName;
    private String phoneNumber;
    private BigDecimal seerBitBalance;
    private String status;
    private String userId;
}
