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
public class NotificationRequestDto {
    private String email;
    private String message;
    private String title;
    private String fingerprint;
    private Boolean email1;
    private Boolean inApp;
    private RecipientRequest recipient;
    private Boolean sms;
}
