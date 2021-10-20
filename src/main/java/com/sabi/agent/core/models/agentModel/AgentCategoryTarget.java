package com.sabi.agent.core.models.agentModel;


import com.sabi.framework.models.CoreEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper=false)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AgentCategoryTarget extends CoreEntity {

    @Column(nullable = false)
    private String name;

    private Long agentCategoryId;
    private Long targetTypeId;
    private Integer min;
    private Integer max;
    private Integer superMax;
}
