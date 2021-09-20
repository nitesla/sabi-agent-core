package com.sabi.agent.core.dto.requestDto.billPayments;


import lombok.Builder;
import lombok.Data;

/**
 *
 * This class collects the request and map it to the entity class
 */

@Builder
@Data
public class AirtimeRequestDto {

    private Long billerId;
    private String denomination;
    private String msisdn;
    private String fingerprint;
}
