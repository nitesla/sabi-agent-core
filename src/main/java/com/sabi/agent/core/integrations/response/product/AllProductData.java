package com.sabi.agent.core.integrations.response.product;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AllProductData {





    private List<AllProductContent> content;
    private AllProductPageable pageable;
    private int totalPages;
    private int totalElements;
    private boolean last;
    private int number;
    private int size;
    private int numberOfElements;
    private AllProductSort sort;
    private boolean first;
    private boolean empty;






}
