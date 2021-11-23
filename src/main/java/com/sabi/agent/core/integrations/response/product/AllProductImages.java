package com.sabi.agent.core.integrations.response.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AllProductImages {

    private String baseImageUrl;
    private List<String> others;
}
