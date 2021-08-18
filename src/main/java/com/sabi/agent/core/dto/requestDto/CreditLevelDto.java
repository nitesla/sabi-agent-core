package com.sabi.agent.core.dto.requestDto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 *
 * This class collects the request and map it to the entity class
 */

@Data
public class CreditLevelDto {

    @NotNull
    @NotEmpty
    private BigDecimal limit;

    @NotNull
    @NotEmpty
    private int repaymentPeriod;


}
