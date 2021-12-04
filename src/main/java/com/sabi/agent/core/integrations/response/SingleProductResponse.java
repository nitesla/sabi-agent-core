package com.sabi.agent.core.integrations.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SingleProductResponse {



    private String status;
    private int code;
    private String message;
    private String timestamp;
    private ProductData data;
    private boolean successful;


}
