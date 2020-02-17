package com.blacklotus.service.dto;

import com.blacklotus.service.common.dto.DTO;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class AuthenticationDTO implements DTO {

    private String accessToken;
    private final String tokenType = "Bearer";
}
