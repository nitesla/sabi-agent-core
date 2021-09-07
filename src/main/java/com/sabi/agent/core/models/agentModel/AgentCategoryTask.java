package com.sabi.agent.core.models.agentModel;


import com.sabi.agent.core.models.Task;
import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;


@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class AgentCategoryTask extends CoreEntity {

    @Column(nullable = false)
    private String name;
    private AgentCategory agentCategory;
    private Task task;
}
