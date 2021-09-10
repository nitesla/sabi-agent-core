package com.sabi.agent.core.models.agentModel;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class AgentVerification {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long agentId;
    private String component;
    private Date dateVerified;
    private int status;
    private LocalDateTime dateSubmitted;
    private Long verifierId;
}
