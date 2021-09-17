package com.sabi.agent.core.models.agentModel;


import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import java.util.Date;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class AgentTarget extends CoreEntity {


    private String name;
    private Agent agentId;
    private Long targetId;
    private Integer min;
    private Integer max;
    private Integer superMax;
}
