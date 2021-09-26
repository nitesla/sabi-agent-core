package com.sabi.agent.core.integrations.order;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderHistoryResponse {

    private String status;
    private String message;
    private int totalRecords;
    private List<OrderHistoryData> data;
}
