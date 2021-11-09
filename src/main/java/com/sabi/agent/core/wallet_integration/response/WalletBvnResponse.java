package com.sabi.agent.core.wallet_integration.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sabi.agent.core.wallet_integration.BvnData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WalletBvnResponse implements IWalletResponse{
    private String code;
    private String message;
    private BvnData data;
    private boolean status;
    private String error;
}
