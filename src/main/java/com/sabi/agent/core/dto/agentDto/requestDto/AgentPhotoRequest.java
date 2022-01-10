package com.sabi.agent.core.dto.agentDto.requestDto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AgentPhotoRequest {
    @NotNull(message = "Agent ID can not be null")
    private Long agentId;
    @NotBlank(message = "Image url can not be blank")
    @URL(message = "Use valid url path for image url")
    private String imageUrl;
}
