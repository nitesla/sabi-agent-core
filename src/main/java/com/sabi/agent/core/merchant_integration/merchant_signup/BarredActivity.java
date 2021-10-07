package com.sabi.agent.core.merchant_integration.merchant_signup;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BarredActivity {
    private boolean barred;
    private String createdAt;
    private UUID id;
    private String reason;
    private String unbarredBy;
    private String unbarredReason;
    private String unbarredTime;
    private String updatedAt;
}
