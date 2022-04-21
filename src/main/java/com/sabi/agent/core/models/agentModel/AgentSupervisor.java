package com.sabi.agent.core.models.agentModel;


import com.sabi.framework.models.CoreEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Transient;

@EqualsAndHashCode(callSuper=false)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AgentSupervisor extends CoreEntity {


    private Long agentId;
    private Long supervisorId;

    /**
     @Description: Adds 'supervisorName' and 'agentName' properties to AgentSupervisor
     @Date:       20/04/2022
     @Author:     Afam Okonkwo
     */
    @Transient
    private String supervisorName;

    @Transient
    private String agentName;

}
