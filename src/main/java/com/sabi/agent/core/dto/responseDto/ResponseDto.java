package com.sabi.agent.core.dto.responseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {

    private String code;
    private String message;
    private Object data;
    private String status;
    private String timestamp;

}
