package com.sabi.agent.core.dto.requestDto;


import com.sabi.agent.core.models.notifications.RecipientRequest;
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
public class NotificationRequest2Dto {


    private String message;
    private String title;
    private Boolean email1;
    private Boolean inApp;
    private RecipientRequest recipients;
    private Boolean sms;

}
