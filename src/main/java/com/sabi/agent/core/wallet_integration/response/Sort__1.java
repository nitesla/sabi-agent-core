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
public class Sort__1 {
    @JsonProperty("direction")
    public String direction;
    @JsonProperty("property")
    public String property;
    @JsonProperty("ignoreCase")
    public Boolean ignoreCase;
    @JsonProperty("nullHandling")
    public String nullHandling;
    @JsonProperty("ascending")
    public Boolean ascending;
    @JsonProperty("descending")
    public Boolean descending;
}
