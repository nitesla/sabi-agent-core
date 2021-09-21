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
public class BillCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer billCategoryId;
    private String billsWallet;
    private String description;
    private Boolean isAvailable;
    private Long maximumPurchaseAmount;
    private Long minimumPurchaseAmount;
    private String name;
}
