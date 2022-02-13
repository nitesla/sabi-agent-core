package com.sabi.agent.core.dto.responseDto;

import com.sabi.agent.core.models.agentModel.AgentCategoryTarget;
import com.sabi.agent.core.models.agentModel.AgentTarget;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AgentCategoryModResponse {
    private String name;
    private String description;
    private boolean isDefault;
    private Long nextCategory;
    private List<AgentCategoryTarget> agentTarget;
}
