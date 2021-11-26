package com.sabi.agent.core.integrations.response.product;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AllProductListingOptions {

    private boolean isOnMerchBuy;
    private boolean isOnMerchList;
}
