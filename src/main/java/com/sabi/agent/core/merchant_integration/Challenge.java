package com.sabi.agent.core.merchant_integration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Challenge {
    private boolean active;
    private String banner;
    private String createdAt;
    private String createdBy;
    private String description;
    private String duration;
    private int frequency;
    private int id;
    private String name;
    private int reward;
    private String updatedAt;
    private String updatedBy;
    private int volume;
}
