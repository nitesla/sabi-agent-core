package com.sabi.agent.core.dto.responseDto.billPayments;


import lombok.Data;

import java.util.List;


/**
 *
 * This class collects the request and map it to the entity class
 */
@Data
public class BillerResponseDTO {
    private Integer billCategoryId;
    private Long commissionRate;
    private String commissionStrategy;
    private String description;
    private String name;
    private String productId;
    private Integer serviceProviderId;
    private Long settlementPercentage;

    private List<BillerResponseDTO> billers = null;
}
