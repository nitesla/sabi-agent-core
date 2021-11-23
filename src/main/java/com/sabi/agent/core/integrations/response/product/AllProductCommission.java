package com.sabi.agent.core.integrations.response.product;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AllProductCommission {


    private boolean categoryDefault;
    private String merchbuyAgentCommission;
    private String merchbuyReferralCommission;
    private String merchbuytotalcommission;
}
