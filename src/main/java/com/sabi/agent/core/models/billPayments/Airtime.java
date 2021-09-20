package com.sabi.agent.core.models.billPayments;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class Airtime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long billerId;
    private String denomination;
    private String msisdn;
    private String code;
    private String data;
    private String message;
    private String status;
    private String timestamp;

}
