package com.sabi.agent.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import java.math.BigDecimal;

/**
 *
 * This class is responsible for persisting to the database
 */
@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class CreditLevel extends CoreEntity {


    private long agentCategoryId;

    private BigDecimal limits;

    private int repaymentPeriod;
}
