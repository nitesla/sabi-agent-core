package com.sabi.agent.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class Bank extends CoreEntity {


    private String name;
    private String bankCode;


    public Bank(String name, String bankCode) {
        this.name = name;
        this.bankCode = bankCode;


    }
}
