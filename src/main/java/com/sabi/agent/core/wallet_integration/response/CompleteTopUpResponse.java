package com.sabi.agent.core.wallet_integration.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompleteTopUpResponse implements IWalletResponse{
    private String code;
    private String message;
    private String status;
    private String error;
    private CompleteTopUpData data;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private  static class CompleteTopUpData {

        private BigDecimal amount;
        private BigDecimal balanceAfter;
        private BigDecimal balanceBefore;
        private BigDecimal chargeAmount;
        private String externalReference;
        private String internalReference;
        private BigDecimal totalAmount;
        private String transactionStatus;
        private String transactionType;
    }
}
