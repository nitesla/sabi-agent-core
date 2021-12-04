package com.sabi.agent.core.dto.requestDto;

import lombok.Data;

@Data
public class WishListDto {

    private Long id;
    private String agentId;
    private String productId;
    private String productName;
    private String picture;
}
