package com.sabi.agent.core.integrations.response;

import com.sabi.agent.core.integrations.response.product.AllProductListingOptions;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
public class MerchantProductCategory {
    private String id;
    private String name;
    private String slug;
    private String description;
    private String parentId;
    private BigDecimal commission;
    private String imageUrl;
    private BigDecimal merchbuyAgentCommission;
    private BigDecimal merchbuyReferralCommission;
    private BigDecimal merchbuytotalcommission;
    private AllProductListingOptions listingOptions;
}