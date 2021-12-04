package com.sabi.agent.core.integrations.response.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AllProductPageable {

    private AllProductSort sort;
    private int pageSize;
    private int pageNumber;
    private int offset;
    private boolean paged;
    private boolean unpaged;
}
