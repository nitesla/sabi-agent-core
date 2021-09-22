package com.sabi.agent.core.wallet_integration.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WalletTransacitonDetailsRequest {
    //{
    //  "endDate": "2021-09-17T15:33:29.772Z",
    //  "name": "string",
    //  "page": 0,
    //  "pageSize": 0,
    //  "phoneNumber": "string",
    //  "startDate": "2021-09-17T15:33:29.772Z",
    //  "transactionClass": "DEBIT",
    //  "transactionReference": "string",
    //  "transactionStatus": "INITIALIZE",
    //  "transactionType": "CREDIT_BANK",
    //  "walletTransactionsSearchTerm": "ALL",
    //  "walletTransactionsSortCriteria": "ASC"
    //}
    @NotBlank(message = "end date can not be empty")
    private String endDate;
    @NotBlank(message = "name can not be empty")
    private String name;
    private long page;
    private long pageSize;
    @NotBlank(message = "Phone number can not be empty")
    private String phoneNumber;
    @NotBlank(message = "Start date can not be empty")
    private String startDate;
    @NotBlank(message = "Transaction class can not be empty")
    private String transactionClass ;
    @NotBlank(message = "Transaction reference can not be empty")
    private String transactionReference ;
    @NotBlank(message = "Transaction type can not be empty")
    private String transactionType ;
    private String walletTransactionsSearchTerm ;
    private String walletTransactionsSortCriteria ;

}
