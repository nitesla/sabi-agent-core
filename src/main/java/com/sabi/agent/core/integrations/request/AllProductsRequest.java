package com.sabi.agent.core.integrations.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AllProductsRequest {




    private String direction;
    private Integer pageNumber;
    private Integer pageSize;
    private String searchString;
    private String sortBy;
    private String state;






}
