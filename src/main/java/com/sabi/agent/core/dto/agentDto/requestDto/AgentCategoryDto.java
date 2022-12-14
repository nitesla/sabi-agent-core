package com.sabi.agent.core.dto.agentDto.requestDto;


import lombok.Data;

@Data
public class AgentCategoryDto {

    private Long id;
    private String name;
    private String description;
    private String image;
    private Long nextAgentCategory;
    private Boolean isDefault;
}