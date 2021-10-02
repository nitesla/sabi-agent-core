package com.sabi.agent.core.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ValidateEmailOtpRequest {

    private String registrationToken;
    private Boolean isEmailVerified;
}
