package com.sabi.agent.core.wallet_integration.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InitiateTopUpResponse implements IWalletResponse{

    private BigDecimal amount;
    private String email;
    private String pocketReferenceId;
    private String reference;
    private String topUpRequestUrl;
    private String topUpStatus;
}
