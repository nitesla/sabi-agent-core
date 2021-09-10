package com.sabi.agent.core.models.agentModel;


import com.sabi.agent.core.models.Supervisor;
import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class AgentSupervisor extends CoreEntity {


    private Long agentId;
    private Long supervisorId;

}
