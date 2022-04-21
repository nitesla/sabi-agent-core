package com.sabi.agent.core.dto.requestDto;


import lombok.Data;

import java.util.Date;

/**
 *
 * This class collects the request and map it to the entity class
 */

@Data
public class UserTaskDto {


    private Long id;
    private String taskName;
    private String userType;
    private String taskType;
    private String taskDescription;
    private String taskDuration;
    private String taskDurationType;
    private Long userId;
    private Long taskId;
    private Date dateAssigned;
    private Date endDate;
    private String status;

}
