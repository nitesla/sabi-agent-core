package com.sabi.agent.core.wallet_integration;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Meta {
    @JsonAlias("free_calls_left")
    private String free_calls_left;
    @JsonAlias("calls_this_month")
    private String calls_this_month;
}
