package com.sabi.agent.core.integrations.response.product;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AllProductResponse {



    private String status;
    private String code;
    private String message;
    private Object description;
    private String timestamp;
    private AllProductData data;






}
