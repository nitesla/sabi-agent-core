package com.sabi.agent.core.integrations.request;

import com.sabi.agent.core.integrations.AgentCommissionInfo;
import com.sabi.agent.core.integrations.MerchCustomerDetails;
import com.sabi.agent.core.integrations.MerchProduct;
import com.sabi.agent.core.integrations.order.OrderDelivery;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MerchBuyRequest {

        private boolean orderPlacedBy;
        private List<MerchProduct> products;
        private MerchCustomerDetails customerDetails;
        private OrderDelivery orderDelivery;
        private String orderReferalCode;
        private int checkoutUserType;
        private String location;
        private String customerComment;
        private String refreshToken;
        private AgentCommissionInfo agentCommissionInfo;
}
