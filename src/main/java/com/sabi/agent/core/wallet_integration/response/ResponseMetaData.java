package com.sabi.agent.core.wallet_integration.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ResponseMetaData implements IWalletResponse{
    private String code;
    private String message;
    private CreateWalletResponse data;
}
