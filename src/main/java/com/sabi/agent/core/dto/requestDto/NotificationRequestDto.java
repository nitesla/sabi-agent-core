package com.sabi.agent.core.dto.requestDto;


import lombok.Builder;
import lombok.Data;

/**
 *
 * This class collects the request and map it to the entity class
 */

@Builder
@Data
public class NotificationRequestDto {

    private String email1;
    private String message;
    private String title;
}
