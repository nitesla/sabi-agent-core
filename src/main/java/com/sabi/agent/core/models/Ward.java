package com.sabi.agent.core.models;

import com.sabi.framework.models.CoreEntity;
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
@Entity
public class Ward extends CoreEntity {

    @Column(nullable = false)
    private String name;

    private Long lgaId;
}
