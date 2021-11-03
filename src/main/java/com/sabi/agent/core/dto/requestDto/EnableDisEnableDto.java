package com.sabi.agent.core.dto.requestDto;


import lombok.Data;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
@Validated
@Valid
public class EnableDisEnableDto {

     private Long id;
     @NotNull
     @NonNull
     private Boolean isActive;
}
