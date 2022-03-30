package com.sabi.agent.core.integrations.order.merch.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class MerchCustomerDetails {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String spacesAccountId;
}
