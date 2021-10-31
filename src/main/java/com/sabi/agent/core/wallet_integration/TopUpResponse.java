package com.sabi.agent.core.wallet_integration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TopUpResponse {
    // "data":{"reference":"ACEJ-48567648129088",
    // "topUpRequestUrl":"https://pay.seerbitapi.com/?ps=gQp4H0My&po=200001285&callbackurl=https://pay.seerbitapi.com/?ps=gQp4H0My&po=200001285&reference=ACEJ-48567648129088&amount=20.0",
    // "topUpStatus":"INITIALIZE","pocketReferenceId":"200001285",
    // "amount":20,"email":"email@email.com"}}
    private String reference;
    private String topUpRequestUrl;
    private String topUpStatus;
    private String pocketReferenceId;
    private BigDecimal amount;
    private String email;
}
