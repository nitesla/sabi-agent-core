package com.sabi.agent.core.dto.agentDto.requestDto;


import lombok.Data;

@Data
public class AgentCategoryTargetDto {

    private Long id;
    private String name;
    private Long agentCategoryId;
    private String agentCategoryName;
    private Integer min;
    private Integer max;
    private Integer superMax;
    private Long targetTypeId;
    private String targetTypeName;
}
