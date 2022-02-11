package com.sabi.agent.core.dto.responseDto.billPayments;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillPaymentResponseDto {
    private String code;
    private String message;
    private List<BillPaymentData> data;
    private String status;
    private String timestamp;
}
