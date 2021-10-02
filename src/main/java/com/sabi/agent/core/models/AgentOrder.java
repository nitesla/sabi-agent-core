package com.sabi.agent.core.models;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class AgentOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean status;
    private Long orderId;
    private Long agentId;
    private Long totalAmount;
    private String userName;
    @ApiModelProperty(hidden = true)
    private Date createdDate ;
}
