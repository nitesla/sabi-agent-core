package com.sabi.agent.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class RegisteredMerchant extends CoreEntity {
    private String merchantId;
    private String firstName;
    private String email;
    private String phoneNumber;
    private String address;
    private String agentId;
}
