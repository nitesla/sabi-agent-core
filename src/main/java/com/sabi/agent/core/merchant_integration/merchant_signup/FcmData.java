package com.sabi.agent.core.merchant_integration.merchant_signup;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FcmData {
    private String businessTopic;
    private List<String> fcmAndroidTokens ;
    private List<String> fcmBrowserTokens ;
    private List<String> fcmIOSTokens ;
    private String userTopic;
}
