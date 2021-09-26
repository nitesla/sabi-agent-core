package com.sabi.agent.core.merchant_integration.merchant_signup;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserChallenge {
    private Challenge challenge;
    private boolean completed;
    private String createdAt;
    private String createdBy;
    private int id;
    private int progress;
    private String updatedAt;
    private String updatedBy;

}
