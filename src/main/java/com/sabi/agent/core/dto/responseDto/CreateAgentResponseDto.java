package com.sabi.agent.core.dto.responseDto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;




@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAgentResponseDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String countryCode;
}
