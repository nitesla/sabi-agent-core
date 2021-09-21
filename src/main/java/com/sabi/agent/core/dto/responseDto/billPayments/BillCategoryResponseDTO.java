package com.sabi.agent.core.dto.responseDto.billPayments;


import lombok.Data;

import java.util.List;


/**
 *
 * This class collects the request and map it to the entity class
 */
@Data
public class BillCategoryResponseDTO {

    private Integer billCategoryId;
    private String billsWallet;
    private String description;
    private Boolean isAvailable;
    private Long maximumPurchaseAmount;
    private Long minimumPurchaseAmount;
    private String name;
    private List<BillCategoryResponseDTO> categorys = null;
}
