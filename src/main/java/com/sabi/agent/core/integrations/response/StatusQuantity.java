package com.sabi.agent.core.integrations.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatusQuantity {

    private int status;
    private String statusDesc;
    private int quantity;
    private Date date;
}
