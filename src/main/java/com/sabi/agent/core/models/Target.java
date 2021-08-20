package com.sabi.agent.core.models;



import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Target extends CoreEntity {


    private String name;


}
