package com.sabi.agent.core.wallet_integration.response;

import com.sabi.agent.core.wallet_integration.BvnData;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WalletBvnResponse implements IWalletResponse{
    private String code;
    private String message;
    private BvnData data;
}
