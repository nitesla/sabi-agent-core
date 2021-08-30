package com.sabi.agent.core.dto.requestDto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ValidateOTPRequest {


    private String registrationToken;

    private Long updatedBy;
    private Boolean isActive;

}
