package com.sabi.agent.core.helpers;


import com.sabi.agent.core.dto.requestDto.StateDto;
import com.sabi.framework.exceptions.BadRequestException;
import com.sabi.framework.utils.CustomResponseCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Validations {

    public void validateState(StateDto stateDto) {
        if (stateDto.getName() == null || stateDto.getName().isEmpty())
            throw new BadRequestException(CustomResponseCode.BAD_REQUEST, "name cannot be empty");

    }
}
