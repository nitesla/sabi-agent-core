package com.sabi.agent.core.merchant_integration.merchant_signup;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Wallets {
    private boolean array;
    private boolean bigDecimal;
    private boolean bigInteger;
    private boolean binary;
    @JsonProperty("boolean")
    private boolean _boolean;
    private boolean containerNode;
    @JsonProperty("double")
    private boolean _double;
    private boolean empty;
    @JsonProperty("float")
    private boolean _float;
    private boolean floatingPointNumber;
    @JsonProperty("int")
    private boolean _int;
    private boolean integralNumber;
    @JsonProperty("long")
    private boolean _long;
    private boolean missingNode;
    private String nodeType;
    @JsonProperty("null")
    private boolean _null;
    private boolean number;
    private boolean object;
    private boolean pojo;
    @JsonProperty("short")
    private boolean _short;
    private boolean textual;
    private boolean valueNode;
}
