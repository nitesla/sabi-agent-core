package com.sabi.agent.core.models;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class Sms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String  message;
    private String phoneNumber;
    private String  errors;
    private String result;

}
