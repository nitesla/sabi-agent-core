package com.sabi.agent.core.dto.responseDto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.time.LocalDateTime;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserTaskResponseDto {


    private Long id;
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

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    private Long createdBy;

    private Long updatedBy;

    private Boolean isActive;
}
