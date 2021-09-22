package com.sabi.agent.core.dto.agentDto.requestDto;

import lombok.Data;

@Data
public class CreateAgentRequestDto {


    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String referrer;
    private String fingerPrint;
}
