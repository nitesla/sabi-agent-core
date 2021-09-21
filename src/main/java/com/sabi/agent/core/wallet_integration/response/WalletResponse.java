package com.sabi.agent.core.wallet_integration.response;

import com.sabi.agent.core.wallet_integration.Transaction;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WalletResponse implements IWalletResponse {
    private Transaction transaction;
}
