package com.sabi.agent.core.dto.requestDto;


import lombok.Data;

import java.util.Date;

/**
 *
 * This class collects the request and map it to the entity class
 */

@Data
public class UserTaskDto {


    private long userId;


    private long taskId;


    private Date dateAssigned;

    private Date endDate;


    private String status;
}
