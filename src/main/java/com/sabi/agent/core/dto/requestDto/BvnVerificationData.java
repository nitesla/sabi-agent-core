package com.sabi.agent.core.dto.requestDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BvnVerificationData {

    private String bvn;
    private String accountNumber;
    private String bankCode;
    private String firstName;
    private String lastName;
    private String phoneNumber;
}
