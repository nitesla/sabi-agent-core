package com.sabi.agent.core.integrations;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MerchCustomerDetails {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String spacesAccountId;
}
