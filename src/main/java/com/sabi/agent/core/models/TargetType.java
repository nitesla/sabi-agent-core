package com.sabi.agent.core.models;



import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@Data
@EqualsAndHashCode(callSuper=false)
@Entity
public class TargetType extends CoreEntity {


    private String name;


}
