package com.sabi.agent.core.wallet_integration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WalletPagable {
    private long offset;
    private long pageNumber;
    private long pageSize;
    private boolean paged;
    private boolean unpaged;
    private WalletMetaDataSort sort;
}
