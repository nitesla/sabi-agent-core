package com.sabi.agent.core.models.agentModel;


import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import java.util.Date;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class AgentVerification extends CoreEntity {

    private Long agentId;
    private String component;
    private Date dateVerified;
    private String status;
    private Date dateSubmitted;
    private Long verifierId;
}
