package com.sabi.agent.core.dto.requestDto;

import lombok.Data;

@Data
    public class GlobalAdminAuthRequestDto {

        private String authKey;
        private String userId;
        private String applicationCode;

}
