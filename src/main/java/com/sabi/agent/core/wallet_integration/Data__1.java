package com.sabi.agent.core.wallet_integration;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Data__1 {
    @JsonProperty("bvn")
    private String bvn;
    @JsonProperty("is_blacklisted")
    private boolean isBlacklisted;
    @JsonProperty("last_name")
    private boolean lastName;
    @JsonProperty("first_name")
    private boolean firstName;
}
