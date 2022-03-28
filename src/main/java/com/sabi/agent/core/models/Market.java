package com.sabi.agent.core.models;


import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

/**
 *
 * This class is responsible for persisting to the database
 */

@EqualsAndHashCode(callSuper=false)
@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Market extends CoreEntity {


    @Column(nullable = false)
    private String name;

    private Long wardId;

    private Long lgaId;

    private Long stateId;

    private Long countryId;

    private  String ward;

    private String lga;

    private String state;

    private String country;

}
