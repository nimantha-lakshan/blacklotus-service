package com.blacklotus.service.dto;

import com.blacklotus.service.common.dto.DTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class InvoiceItemDTO implements DTO {

    @JsonIgnore
    private String id;
    private String productId;
    private String product;
    private String unitType;
    private Double quantity;
    private Double unitPrice;
    private String notes;
}
