package com.sabi.agent.core.models.agentModel;


import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Transient;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class AgentTarget extends CoreEntity {


    private String name;
    private Long agentId;
    private Long targetId;
    @Transient
    private String targetTypeName;
    @Transient
    private String agentName;
    private Integer min;
    private Integer max;
    private Integer superMax;
}
