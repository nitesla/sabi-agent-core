package com.sabi.agent.core.dto.responseDto;


import lombok.Data;



/**
 *
 * This class collects the response and map it to the entity class
 */

@Data
public class NotificationResponseDto {

     private String code;
     private Object data;
     private String message;
}
