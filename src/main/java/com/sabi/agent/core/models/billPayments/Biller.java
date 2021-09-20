package com.sabi.agent.core.models.billPayments;


import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * This class collects the request and map it to the entity class
 */

@Builder
@Data
public class Biller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer billCategoryId;
    private Long commissionRate;
    private String commissionStrategy;
    private String description;
    private String name;
    private String productId;
    private Integer serviceProviderId;
    private Long settlementPercentage;
}
