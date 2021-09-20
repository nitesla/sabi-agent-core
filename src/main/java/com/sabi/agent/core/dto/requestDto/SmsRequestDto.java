package com.sabi.agent.core.dto.requestDto;


import lombok.Builder;
import lombok.Data;

/**
 *
 * This class collects the request and map it to the entity class
 */

@Builder
@Data
public class SmsRequestDto {

    private String  message;
    private String phoneNumber;
    private String fingerprint;
}
