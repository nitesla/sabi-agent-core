package com.sabi.agent.core.dto.responseDto.billPayments;



import com.sabi.agent.core.dto.requestDto.billPayments.BillCategoryDTO;
import lombok.Data;

import java.util.List;


/**
 *
 * This class collects the request and map it to the entity class
 */
@Data
public class BillCategoryResponseDTO {


    private List<BillCategoryDTO> categorys = null;
}
