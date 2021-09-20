package com.sabi.agent.core.dto.responseDto.billPayments;


import lombok.Data;

/**
 *
 * This class collects the response and map it to the entity class
 */

@Data
public class AirtimeResponseDto {

    private Long billerId;
    private String denomination;
    private String msisdn;
}
