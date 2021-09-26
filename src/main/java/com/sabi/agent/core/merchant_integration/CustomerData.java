package com.sabi.agent.core.merchant_integration;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerData {
    @JsonProperty("date_created")
    private String dateCreated;
    @JsonProperty("date_of_birth")
    private String dateOfBirth;
    @JsonProperty("date_status_changed")
    private String dateStatusChanged;
    @JsonProperty("email_address")
    private String emailAddress;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("id")
    private String id;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("middle_name")
    private String middleName;
    @JsonProperty("mobile_number")
    private String mobileNumber;
    @JsonProperty("partner_id")
    private String partnerId;
    @JsonProperty("sex")
    private String sex;
    @JsonProperty("status")
    private String status;
    @JsonProperty("wallet")
    private Wallet wallet;
    @JsonProperty("wallets")
    private Wallets wallets;
}
