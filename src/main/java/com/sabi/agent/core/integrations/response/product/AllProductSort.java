package com.sabi.agent.core.integrations.response.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AllProductSort {

    private boolean sorted;
    private boolean unsorted;
    private boolean empty;
}
