package com.sabi.agent.core.wallet_integration.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WalletStatusResponse implements IWalletResponse{
    private BigDecimal balance;
    private String fundingLink;
    private BigDecimal seerBitBalance;
    private String status;
    private String userId;
    private String totalCommissionEarned;
}
