package com.sabi.agent.core.integrations.request;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AllProductsRequest {

    @JsonProperty("BusinessId")
    private String businessId;
    @JsonProperty("BranchId")
    private String branchId;
    @JsonProperty("CategoryId")
    private String categoryId;
    @JsonProperty("PageNumber")
    private Integer pageNumber;
    @JsonProperty("PageSize")
    private Integer pageSize;
    @JsonProperty("BusinessSlug")
    private String businessSlug;
    @JsonProperty("BranchSlug")
    private String branchSlug;
    @JsonProperty("ProductName")
    private String productName;
    @JsonProperty("State")
    private String state;
    @JsonProperty("Orderby")
    private Integer orderBy;
}
