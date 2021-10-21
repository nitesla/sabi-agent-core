package com.sabi.agent.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.math.BigDecimal;

/**
 *
 * This class is responsible for persisting to the database
 */
@EqualsAndHashCode(callSuper=false)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CreditLevel extends CoreEntity {


    private Long agentCategoryId;

    private BigDecimal limits;

    private int repaymentPeriod;
}
