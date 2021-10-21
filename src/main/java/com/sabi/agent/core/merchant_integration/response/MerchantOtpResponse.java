package com.sabi.agent.core.merchant_integration.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MerchantOtpResponse {
   //{"pinCode":"409833",
   // "userId":"1cbdcfcd-b65e-4f0b-8035-8fa83d7fd5e9",
   // "msisdn":"2349099009918",
   // "description":"PinCode has been sent to your mobile phone."}
   private String pinCode;
   private String userId;
   private String status;
   private String msisdn;
   private String description;
}
