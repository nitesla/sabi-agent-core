package com.sabi.agent.core.integrations.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WholeSaleData {

    private int minQty;
    private BigDecimal pricePerUnit;
    private BigDecimal listingPricePerUnit;


}
