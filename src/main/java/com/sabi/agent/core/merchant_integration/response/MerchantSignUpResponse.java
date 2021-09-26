package com.sabi.agent.core.merchant_integration.response;

import com.sabi.agent.core.merchant_integration.AgentUser;
import com.sabi.agent.core.merchant_integration.TokenData;
import com.sabi.agent.core.merchant_integration.UserData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MerchantSignUpResponse {
    private AgentUser agentUser;
    private String errors;
    private String result;
    private TokenData tokenData;
    private UserData userData;
}
