package com.sabi.agent.core.models.agentModel;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.annotation.security.DenyAll;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class AgentCard extends CoreEntity {

    private String cardToken;
    private String bin;
    private String last4;
    private Boolean isDefault;
    private Long agentId;
}
