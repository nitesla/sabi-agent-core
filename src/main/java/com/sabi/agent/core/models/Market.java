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

    private  String ward;

    @Transient
    private Long lgaId;

    @Transient
    private Long stateId;

    @Transient
    private Long countryId;

    @Transient
    private String lga;

    @Transient
    private String state;

    @Transient
    private String country;

}
