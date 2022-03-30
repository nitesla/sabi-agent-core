package com.sabi.agent.core.dto.agentDto.requestDto;



import lombok.Data;

@Data
public class AgentVerificationDto {

    private Long id;
    private String address;
    private String idCard;
    private String idCardType;

}
