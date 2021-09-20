package com.sabi.agent.core.integrations.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BulkPriceData {

    private int moq;
    private BigDecimal price;



}
