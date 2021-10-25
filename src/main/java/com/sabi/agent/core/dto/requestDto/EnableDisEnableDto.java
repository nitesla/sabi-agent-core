package com.sabi.agent.core.dto.requestDto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.NotNull;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnableDisEnableDto {

     private Long id;
     @NotNull
     @AssertFalse
     private boolean isActive;
}
