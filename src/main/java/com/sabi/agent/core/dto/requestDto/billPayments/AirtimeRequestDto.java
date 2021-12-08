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
public class AirtimeRequestDto {

    private Long billerId;
    private String denomination;
    private String msisdn;
    private String requestApp;
    private String fingerprint;
    private String userId;
}
