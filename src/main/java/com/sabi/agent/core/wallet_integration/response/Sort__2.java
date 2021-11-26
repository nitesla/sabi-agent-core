package com.sabi.agent.core.wallet_integration.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Sort__2 {
    @JsonProperty("direction")
    private String direction;
    @JsonProperty("property")
    private String property;
    @JsonProperty("ignoreCase")
    private Boolean ignoreCase;
    @JsonProperty("nullHandling")
    private String nullHandling;
    @JsonProperty("ascending")
    private Boolean ascending;
    @JsonProperty("descending")
    private Boolean descending;
}
