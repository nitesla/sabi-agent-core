package com.sabi.agent.core.models;


import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * This class is responsible for persisting to the database
 */

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class Task extends CoreEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String taskType;

    @Column(nullable = false)
    private String priority;

    private int duration;

    private String durationType;

    private Boolean uploadRequires;
}
