package com.sabi.agent.core.dto.requestDto.billPayments;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 *
 * This class collects the request and map it to the entity class
 */

@NoArgsConstructor
@AllArgsConstructor
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
