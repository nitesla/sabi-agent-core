package com.sabi.agent.core.dto.requestDto;

import lombok.Data;

import java.math.BigDecimal;

/**
 *
 * This class collects the request and map it to the entity class
 */

@Data
public class CreditLevelDto {

    private Long id;

    private BigDecimal limit;

    private int repaymentPeriod;

    private Long agentCategoryId;


}
