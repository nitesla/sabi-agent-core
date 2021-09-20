package com.sabi.agent.core.models.notifications;


import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Builder
@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean email;
    private Boolean inApp;
    private String message;
    @OneToOne
    private Recipient recipients;
    private Boolean sms;
    private String title;
    private String code;
    private String data;

}
