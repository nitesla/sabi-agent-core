package com.sabi.agent.core.merchant_integration.merchant_signup;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AgentUser {
    private AgentDocuments agentDocuments;
    private AgentNetwork agentNetwork;
    private List<ApplicationIntegration> applicationIntegrations;
    private List<AssignedRejectedReason> assignedRejectedReasons;
    private boolean barred;
    private List<BarredActivity> barredActivities;
    private BusinessData businessData;
    private BvnValidationData bvnValidationData;
    private Boolean bvnVerified;
    private String createdAt;
    private List<Customer> customers;
    private MerchantData data;
    private String dateBarred;
    private DefaultBankAccountData defaultBankAccountData;
    private DeviceData deviceData;
    private int failedDeviceVerificationAttempt;
    private String fullName;
    private String gamesUsername;
    private String id;
    private String initialLoginDeviceVerificationTime;
    private String lastGamesAttempt;
    private List<Lecture> lectures;
    private List<LoginActivity> loginActivities;
    private String name;
    private NextKinData nextKinData;
    private boolean otpRequired;
    private String password;
    private String passwordUpdatedTime;
    private Role role;
    private List<Shop> shops ;
    private List<Token> tokens;
    private String uniqueIdentifier;
    private String updatedAt;
    private List<UserActivityEntity> userActivityEntities;
    private List<UserChallenge> userChallenges;
    private boolean validity;
    private WalletRave walletRave;
    private WalletSpaces walletSpaces;
}
