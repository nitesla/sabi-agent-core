package com.sabi.agent.core.models.agentModel;


import com.sabi.framework.models.CoreEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper=false)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AgentLocation extends CoreEntity {

    private Long agentId;
    private String locationType;
    private Long locationId;
    private String locationName;
}
