package com.sabi.agent.core.models;

import com.sabi.framework.models.CoreEntity;
import com.sabi.framework.models.User;
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




    private User userId;

    private Task taskId;

    @Column(nullable = false)
    private Date dateAssigned;

    private Date endDate;

    @Column(nullable = false)
    private String status;


}
