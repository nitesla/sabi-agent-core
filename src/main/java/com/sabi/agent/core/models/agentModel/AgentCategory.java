package com.sabi.agent.core.models.agentModel;


import com.sabi.framework.models.CoreEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper=false)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AgentCategory extends CoreEntity {

    private String description;
    private Boolean isDefault;
    private String image;
    private String name;
    private Long nextAgentCategory;


    public AgentCategory(String name,String description,Boolean isDefault) {
        this.name = name;
        this.description = description;
        this.isDefault = isDefault;

    }

}
