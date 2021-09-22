package com.sabi.agent.core.wallet_integration.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WalletToBankTransferRequest {
    @NotBlank(message = "Account name cano not be empty")
    private String accountName;
    @NotBlank(message = "Account number can not be ampty")
    private String accountNumber;
    @DecimalMin(value = "0.0", message = "Amount can not be a negative value")
    private BigDecimal amount;
    @NotBlank(message = "Bank code can not be empty")
    private String bankCode;
    @NotBlank(message = "Narration can not be empty")
    private String narration;
    @NotBlank(message = "Receiver phone number can not be empty")
    private String receiverPhoneNumber;
    @DecimalMin(value = "0.0", message = "Transaction Charge can not be less the 0")
    private BigDecimal transactionCharge;
    @NotBlank(message = "Transaction type can not be empty")
    private  String transactionTypeEnum ;
}
