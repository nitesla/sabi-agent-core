package com.sabi.agent.core.dto.responseDto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;



@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CountryResponseDto {


    private Long id;

    private String name;

    private String code;
}
