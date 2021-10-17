package com.sabi.agent.core.dto.agentDto.requestDto;


import com.sabi.agent.core.models.agentModel.AgentCategory;
import lombok.Data;

@Data
public class AgentCategoryDto {

    private Long id;
    private String name;
    private String description;
    private String image;
    private boolean isDefault;
}