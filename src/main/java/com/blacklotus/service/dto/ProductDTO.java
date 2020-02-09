package com.blacklotus.service.dto;

import com.blacklotus.service.common.dto.DTO;
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
    private String categoryId;
    private String category;
}
