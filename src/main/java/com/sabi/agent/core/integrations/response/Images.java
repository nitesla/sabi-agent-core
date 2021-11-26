package com.sabi.agent.core.integrations.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Images {

    private String baseImageUrl;
}
