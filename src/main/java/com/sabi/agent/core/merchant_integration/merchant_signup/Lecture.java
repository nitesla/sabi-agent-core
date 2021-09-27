package com.sabi.agent.core.merchant_integration.merchant_signup;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Lecture {
    private String courseCategory;
    private String courseDescription;
    private String courseDuration;
    private String coursePhotoLink;
    private String courseStatus;
    private String courseTitle;
    private String createdAt;
    private String id;
    private String lectureTitle;
    private String ownerId;
    private String pdfLink;
    private String powerpointLink;
    private String updatedAt;
    private String videoLink;
}
