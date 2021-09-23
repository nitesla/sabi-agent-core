package com.sabi.agent.core.models.notifications;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@SuppressWarnings("All")
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class RecipientRequest {
    @Id
    private String email;
    private String phoneNo;
}
