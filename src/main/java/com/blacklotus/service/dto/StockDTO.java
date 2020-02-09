package com.blacklotus.service.dto;

import com.blacklotus.service.common.dto.DTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class StockDTO implements DTO {

    private String id;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private ProductDTO product;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String productId;
    private Double quantity;
    private Double unitPrice;
    private String unitType;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Date dateCreated;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Date dateUpdated;
}
