package com.sabi.agent.core.integrations.order.merch.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MerchComment {
    private Long id;
    private String comment;
    private String username;
    private LocalDateTime createddate;
    private int type;
    private String typeDescription;
    private Long entityId;
}
