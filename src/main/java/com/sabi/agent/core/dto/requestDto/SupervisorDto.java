package com.sabi.agent.core.dto.requestDto;

import lombok.Data;

/**
 *
 * This class collects the request and map it to the entity class
 */

@Data
public class SupervisorDto {

    private Long id;
    private long userId;
    private long agentId;
}
