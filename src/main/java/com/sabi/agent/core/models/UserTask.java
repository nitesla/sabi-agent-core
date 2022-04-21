package com.sabi.agent.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Transient;
import java.util.Date;

/**
 *
 * This class is responsible for persisting to the database
 */

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class UserTask extends CoreEntity {

    private String taskName;
    private String userType;
    private String taskType;
    private String taskDescription;
    private String taskDuration;
    private String taskDurationType;
    private Long userId;
    private Long taskId;

    private Date endDate;

    @Column(nullable = false)
    private Date dateAssigned;

    @Column(nullable = false)
    private String status;

    @Transient
    private String User;


}
