package com.sabi.agent.core.merchant_integration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActivityData {
    private String createdAt;
    private String id;
    private String lastActiveDate;
    private ShopData shopData;
    private UserData userData;
}
