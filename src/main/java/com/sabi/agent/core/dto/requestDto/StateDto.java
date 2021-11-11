package com.sabi.agent.core.dto.requestDto;


import lombok.Data;

/**
 *
 * This class collects the request and map it to the entity class
 */

@Data
public class StateDto {

    private Long id;

    private String name;

    private Long countryId;
}
