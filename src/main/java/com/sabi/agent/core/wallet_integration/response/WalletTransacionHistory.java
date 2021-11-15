package com.sabi.agent.core.wallet_integration.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class WalletTransacionHistory {
    private List<WalletHistoryContent> content;
    @JsonProperty("pageable")
    private HistoryPageable pageable;
    @JsonProperty("totalPages")
    private Integer totalPages;
    @JsonProperty("totalElements")
    private Integer totalElements;
    @JsonProperty("last")
    private Boolean last;
    @JsonProperty("number")
    private Integer number;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("numberOfElements")
    private Integer numberOfElements;
    @JsonProperty("sort")
    private List<Sort__1> sort;
    @JsonProperty("first")
    private Boolean first;
    @JsonProperty("empty")
    private Boolean empty;
}
