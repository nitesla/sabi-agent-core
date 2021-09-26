package com.sabi.agent.core.dto.responseDto.billPayments;


import lombok.Data;

/**
 *
 * This class collects the response and map it to the entity class
 */

@Data
public class AirtimeResponseDto {

    private String code;
    private Object data;
    private String message;
    private String status;
    private String timestamp;

}
