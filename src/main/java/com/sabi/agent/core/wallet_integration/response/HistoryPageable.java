package com.sabi.agent.core.wallet_integration.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class HistoryPageable {
    @JsonProperty("sort")
    private List<Sort__2> sort;
    @JsonProperty("pageSize")
    private Integer pageSize;
    @JsonProperty("pageNumber")
    private Integer pageNumber;
    @JsonProperty("offset")
    private Integer offset;
    @JsonProperty("paged")
    private Boolean paged;
    @JsonProperty("unpaged")
    private Boolean unpaged;
}
