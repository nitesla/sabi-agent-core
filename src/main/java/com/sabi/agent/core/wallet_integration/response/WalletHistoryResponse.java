package com.sabi.agent.core.wallet_integration.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WalletHistoryResponse implements IWalletResponse{
    @JsonProperty("transactions")
    private WalletTransacionHistory data;
    private String code;
    private String message;
    private String error;
}
