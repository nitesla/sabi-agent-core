package com.sabi.agent.core.integrations.request;

import com.sabi.agent.core.integrations.response.Payment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompleteOrderRequest {

    private long orderId;
    private String partnerCode;
    private Payment payment;
    private String referralCode;
    private BankDetails bankDetails;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    private static class BankDetails {
        private String accountNumber;
        private String accountName;
        private String bankName;
    }
}
