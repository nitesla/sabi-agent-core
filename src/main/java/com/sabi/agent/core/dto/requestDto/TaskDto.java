package com.sabi.agent.core.dto.requestDto;


import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 *
 * This class collects the request and map it to the entity class
 */

@Data
public class TaskDto {

    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @NotEmpty
    private String taskType;

    @NotNull
    @NotEmpty
    private String priority;

    private int duration;

    private String durationType;
}
