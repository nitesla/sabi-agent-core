package com.sabi.agent.core.integrations.order;


import lombok.Data;

@Data
public class OrderHistoryRequest {
    private Integer pageNumber;
    private Integer pageSize;
}
