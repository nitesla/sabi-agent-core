package com.sabi.agent.core.dto.responseDto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StateResponseDto {

    private String name;

    private Date createdDate;

    private Date updatedDate;

    private Long createdBy;

    private Boolean Isactive;
}
