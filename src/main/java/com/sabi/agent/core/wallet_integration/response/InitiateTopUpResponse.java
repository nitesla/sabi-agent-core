package com.sabi.agent.core.wallet_integration.response;

import com.sabi.agent.core.wallet_integration.TopUpResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InitiateTopUpResponse implements IWalletResponse{
    //{"code":"00","message":"Successfully initiated top up request",


    private String code;
    private String message;
    private TopUpResponse data;
}
