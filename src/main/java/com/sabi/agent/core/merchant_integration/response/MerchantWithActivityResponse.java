package com.sabi.agent.core.merchant_integration.response;

import com.sabi.agent.core.merchant_integration.ActivityData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MerchantWithActivityResponse {
    private List<ActivityData> activityData;
    private int pageNumber;
    private int pageSize;
    private int total;
}
