package com.blacklotus.service.dto;

import com.blacklotus.service.common.dao.DAO;
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
public class VendorDTO implements DAO {

    @JsonIgnore
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String contactPerson;
}
