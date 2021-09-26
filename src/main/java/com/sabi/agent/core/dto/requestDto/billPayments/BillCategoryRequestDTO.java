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
public class BillCategoryRequestDTO {

    private String direction;
    private String fingerprint;
    private Integer page;
    private Integer size;
    private String sortBy;
}
