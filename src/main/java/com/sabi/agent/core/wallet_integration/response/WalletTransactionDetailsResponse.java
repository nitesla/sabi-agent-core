package com.sabi.agent.core.wallet_integration.response;

import com.sabi.agent.core.wallet_integration.WalletMetaDataSort;
import com.sabi.agent.core.wallet_integration.WalletPagable;
import com.sabi.agent.core.wallet_integration.WalletTransactionContent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WalletTransactionDetailsResponse implements IWalletResponse{
//{
//  "content": [
//    {
//      "accountNumber": "string",
//      "bankName": "string",
//      "confirmedDate": "2021-09-17T15:34:23.649Z",
//      "createdDate": "2021-09-17T15:34:23.649Z",
//      "currentBalance": 0,
//      "description": "string",
//      "finalBalance": 0,
//      "receiverName": "string",
//      "receiverPhoneNumber": "string",
//      "senderName": "string",
//      "senderPhoneNumber": "string",
//      "startingBalance": 0,
//      "transactionAmount": 0,
//      "transactionCharge": 0,
//      "transactionClass": "string",
//      "transactionReference": "string",
//      "transactionStatus": "string",
//      "transactionType": "string",
//      "uniqueReference": "string"
//    }
//  ],
//  "empty": true,
//  "first": true,
//  "last": true,
//  "number": 0,
//  "numberOfElements": 0,
//  "pageable": {
//    "offset": 0,
//    "pageNumber": 0,
//    "pageSize": 0,
//    "paged": true,
//    "sort": {
//      "empty": true,
//      "sorted": true,
//      "unsorted": true
//    },
//    "unpaged": true
//  },
//  "size": 0,
//  "sort": {
//    "empty": true,
//    "sorted": true,
//    "unsorted": true
//  },
//  "totalElements": 0,
//  "totalPages": 0
//}

    private List<WalletTransactionContent> content;
    private boolean empty;
    private boolean first;
    private boolean last;
    private long number;
    private long numberOfElements;
    private WalletPagable pagable;
    private long size;
    private WalletMetaDataSort sort;
    private long totalElements;
    private long totalPages;
}
