package com.sabi.agent.core.dto.requestDto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 *
 * This class collects the request and map it to the entity class
 */

@Data
public class SupervisorDto {
    @NotNull
    @NotEmpty
    private long userId;
}
