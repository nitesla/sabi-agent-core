package com.sabi.agent.core.dto.requestDto;


import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 *
 * This class collects the request and map it to the entity class
 */

@Data
public class UserTaskDto {

    @NotNull
    @NotEmpty
    private long userId;

    @NotNull
    @NotEmpty
    private long taskId;

    @NotNull
    @NotEmpty
    private Date dateAssigned;

    private Date endDate;

    @NotNull
    @NotEmpty
    private String status;
}
