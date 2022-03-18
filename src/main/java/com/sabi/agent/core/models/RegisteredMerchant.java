package com.sabi.agent.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Transient;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class RegisteredMerchant extends CoreEntity {
    private String merchantId;
    private String firstName;
    private String email;
    private String lastName;
    private String businessName;
    private String phoneNumber;
    private String address;
    private String agentId;
    private String state;
    private String lga;
    private String country;
    @Transient
    private String agentName;
}
