package com.sabi.agent.core.integrations.order.merch.response;

import lombok.Data;

@Data
public class MerchResponseData {
    private boolean status;
    private String message;
    private MerchData data;
}
