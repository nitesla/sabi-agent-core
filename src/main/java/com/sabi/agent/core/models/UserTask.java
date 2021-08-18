package com.sabi.agent.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

/**
 *
 * This class is responsible for persisting to the database
 */

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class UserTask extends CoreEntity {




    private long userId;

    private long taskId;

    @Column(nullable = false)
    private Date dateAssigned;

    private Date endDate;

    @Column(nullable = false)
    private String status;


}
