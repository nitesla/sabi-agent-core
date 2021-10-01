package com.sabi.agent.core.models.agentModel;


import com.sabi.framework.models.CoreEntity;
import lombok.*;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AgentBank extends CoreEntity {

    private Long agentId;
    private Long bankId;
    private boolean isDefault;
    private String accountNumber;
}
