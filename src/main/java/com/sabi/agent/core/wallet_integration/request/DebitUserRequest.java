package com.sabi.agent.core.wallet_integration.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DebitUserRequest {
    @DecimalMin(value = "0.0", message = "Amount can not be negative")
    private BigDecimal amount;
    @NotBlank(message = "Description can not be empty")
    private String description;
    @DecimalMin(value = "0.0", message = "Transaction charge cannot be a negative value")
    private BigDecimal transactionCharge;
    @NotBlank(message = "transaction type can not be blank")
    private  String transactionTypeEnum ;
}
