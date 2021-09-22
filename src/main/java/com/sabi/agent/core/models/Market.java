package com.sabi.agent.core.models;


import com.sabi.framework.models.CoreEntity;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * This class is responsible for persisting to the database
 */

@EqualsAndHashCode(callSuper=false)
@Data
@Builder
@Entity
public class Market extends CoreEntity {


    @Column(nullable = false)
    private String name;

    private Long wardId;
}
