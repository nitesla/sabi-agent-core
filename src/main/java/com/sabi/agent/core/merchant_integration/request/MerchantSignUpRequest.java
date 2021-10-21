package com.sabi.agent.core.merchant_integration.request;

import com.sabi.agent.core.merchant_integration.AgentCustomer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MerchantSignUpRequest {
    //    private AgentCustomer agentCustomer;
    //{
//   "firstName":"Joy",
//   "lastName":"Jane",
//   "email":"ue1u@gmaiul.com",
//   "country":"NG",
//   "phoneNumber":"08097891894",
//   "businessName":"Teslim124",
//   "streetAddress":"Close 55, house 17, Sattelite town, Lagos",
//   "businessPhoneNumber":"+2348097897894",
//   "state":"Bayelsa",
//   "lga":"Sagbama",
//   "msisdn":"+2348097897894",
//   "password":"123456",
//   "businessCategories":[
//
//   ],
//   "referralCode":null
//}
    private List<String> businessCategories;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String country;
    private String phoneNumber;
    private String businessName;
    private String streetAddress;
    private String businessPhoneNumber;
    private String state;
    private String lga;
    //id of agent creating the merchant
    private String agentId;
    private String msisdn;
    private String password;
}
