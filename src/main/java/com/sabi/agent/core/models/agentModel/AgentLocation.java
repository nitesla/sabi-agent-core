package com.sabi.agent.core.models.agentModel;


import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class AgentLocation extends CoreEntity {


    private long agentId;
    private String locationType;
    private AgentLocation location;
    private String locationName;
}
