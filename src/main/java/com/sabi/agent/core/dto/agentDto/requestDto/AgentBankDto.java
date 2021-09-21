package com.sabi.agent.core.dto.agentDto.requestDto;


import lombok.Data;

@Data
public class AgentBankDto {
    private Long id;
    private Long agentId;
    private Long bankId;
    private String accountNumber;
}
