package com.sabi.agent.core.dto.requestDto.billPayments;


import lombok.Builder;
import lombok.Data;


/**
 *
 * This class collects the request and map it to the entity class
 */

@Builder
@Data
public class BillerRequestDTO {

    private Integer billCategoryId;
    private Long commissionRate;
    private String commissionStrategy;
    private String description;
    private String name;
    private String productId;
    private Integer serviceProviderId;
    private Long settlementPercentage;
}
