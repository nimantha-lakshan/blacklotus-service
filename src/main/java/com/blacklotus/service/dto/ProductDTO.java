package com.blacklotus.service.dto;

import com.blacklotus.service.common.dto.DTO;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class ProductDTO implements DTO {

    private String id;
    private String name;
    private Boolean active;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String categoryId;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private ProductCategoryDTO category;
}
