package com.sabi.agent.core.dto.requestDto;

import lombok.Data;

@Data
public class wishListDto {

    private Long id;
    private String agentId;
    private String productId;
    private String productName;
    private String picture;
}
