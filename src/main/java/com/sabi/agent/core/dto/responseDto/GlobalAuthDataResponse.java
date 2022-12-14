package com.sabi.agent.core.dto.responseDto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public class GlobalAuthDataResponse {

        private Long id;
        private String firstName;
        private String lastName;
        private String phone;
        private String username;
        private Long userId;
        private String applicationCode;
        private String actionDate;
        private String token;
        private String authKeyExpirationDate;
        private List<Object> permissions;

}
