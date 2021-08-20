package com.sabi.agent.core.dto.requestDto;


import lombok.Data;

/**
 *
 * This class collects the request and map it to the entity class
 */

@Data
public class TaskDto {


    private Long id;

    private String name;


    private String taskType;


    private String priority;

    private int duration;

    private String durationType;
}
