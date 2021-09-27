package com.sabi.agent.core.merchant_integration.merchant_signup;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MerchantData {
    private String activationDate;
    private boolean active;
    private String agentCodeToShare;
    private AgentNetworkDetails agentNetworkDetails;
    private String agentState;
    private AgentTeamsDetails agentTeamsDetails;
    private boolean allowBeta;
    private String avatar;
    private boolean bvnVerified;
    private String country;
    private boolean credentialsNonExpired;
    private DeliverInformation deliverInformation;
    private String dob;
    private String documentType;
    private String email;
    private String firstName;
    private String gamesUserName;
    private boolean hasTransactionPin;
    private String houseAddress;
    private String lastName;
    private String lga;
    private String msisdn;
    private String pinCode;
    private List<String> realmNames;
    private String referralCode;
    private String referringAgentName;
    private String state;
    private String tier;
    private List<String> userEducations;

}
