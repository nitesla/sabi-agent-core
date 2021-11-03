package com.sabi.agent.core.merchant_integration.response;

import com.sabi.agent.core.merchant_integration.merchant_signup.BusinessData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MerchantDetailResponse {
    //{"firstName":"Joy","lastName":"Jane","avatar":"","businessProfileData":
    // {"businessName":"Ti dslu9","streetAddress":"Close 55, house 111, Sattelite inter, Lagos",
    // "state":"Bayelsa","lga":"Sagbama","email":"tepnnmnbni@gmaiul.com",
    // "businessPhoneNumber":"09069118800","businessCategories":[]},"country":"NG",
    // "roleName":"ROLE_USER","registrationFinished":true,"hasTransactionPin":false,
    // "bankDataPresent":false,"documentsUploaded":false,"barred":false,"bvnVerified":false,
    // "shopCreated":true}

    private String firstName;
    private String lastName;
    private String avatar;
    private BusinessData businessProfileData;
    private String country;
    private String roleName;
    private Boolean registrationFinished;
    private Boolean hasTransactionPin;
    private Boolean bankDataPresent;
    private Boolean documentsUploaded;
    private Boolean barred;
    private Boolean bvnVerified;
    private Boolean shopCreated;
}
