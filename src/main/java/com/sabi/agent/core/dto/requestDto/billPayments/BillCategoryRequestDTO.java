package com.sabi.agent.core.dto.requestDto.billPayments;


import lombok.Builder;
import lombok.Data;


/**
 *
 * This class collects the request and map it to the entity class
 */

@Builder
@Data
public class BillCategoryRequestDTO {

    private String direction;
    private String fingerprint;
    private Integer page;
    private Integer size;
    private String sortBy;
    private Integer billCategoryId;
    private String billsWallet;
    private String description;
    private Boolean isAvailable;
    private Long maximumPurchaseAmount;
    private Long minimumPurchaseAmount;
    private String name;
}
