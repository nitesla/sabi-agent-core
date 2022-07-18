package com.sabi.agent.core.dto.responseDto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sabi.framework.models.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GlobalAdminAuthResponse {

    @JsonProperty("accessToken")
    private String accessToken;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("email")
    private String email;
    @JsonProperty("menu")
    private String menu;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("middleName")
    private String middleName;
    @JsonProperty("lastLogin")
    private LocalDateTime lastLogin;
    @JsonProperty("tokenExpiry")
    private long tokenExpiry;
    @JsonProperty("userId")
    private long userId;
    private String accessList;
    private Long globalAdminUserId;

    private String globalAdminToken;

    private String applicationCode;
    private String username;

    private String actionDate;

    private String authKeyExpirationDate;


}
