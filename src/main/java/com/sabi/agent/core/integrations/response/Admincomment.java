package com.sabi.agent.core.integrations.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Admincomment {
    @JsonProperty("id")
    private long id;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("username")
    private String username;
    @JsonProperty("createddate")
    private String createddate;
    @JsonProperty("type")
    private int type;
    @JsonProperty("typeDescription")
    private String typeDescription;
    @JsonProperty("entityId")
    private int entityId;
}
