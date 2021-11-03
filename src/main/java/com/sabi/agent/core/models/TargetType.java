package com.sabi.agent.core.models;



import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.validation.Valid;

@Data
@EqualsAndHashCode(callSuper=false)
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Valid
public class TargetType extends CoreEntity {


    private String name;


}
