package com.sabi.agent.core.models.agentModel;


import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class AgentBank extends CoreEntity {

    private Long agentId;
    private Long bankId;
    private String bankName;
    private boolean isDefault;
    private String accountNumber;
}
