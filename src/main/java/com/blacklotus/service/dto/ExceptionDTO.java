package com.blacklotus.service.dto;

import com.blacklotus.service.common.dto.DTO;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Component
public class ExceptionDTO implements DTO {

    private int status;
    private String message;
    private String timeStamp;
}