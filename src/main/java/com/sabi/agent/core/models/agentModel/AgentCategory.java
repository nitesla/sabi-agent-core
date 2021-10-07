package com.sabi.agent.core.models.agentModel;


import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper=false)
@Entity
@Data
public class AgentCategory extends CoreEntity {

    private String description;
    private boolean isDefault;
    private String image;
    private String name;

}
