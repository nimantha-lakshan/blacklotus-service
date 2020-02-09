package com.blacklotus.service.common.controllers;

import com.blacklotus.service.common.dto.DTO;
import com.blacklotus.service.dto.ResponseDTO;
import lombok.NonNull;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class AbstractRestController {

    public ResponseEntity<Object> processResponse(@NonNull HttpStatus httpStatus, HttpHeaders headers, DTO body) {
        ResponseDTO response = ResponseDTO.builder()
                .status(httpStatus.value())
                .message("Success")
                .body(body)
                .build();
        return new ResponseEntity<>(response, headers, httpStatus);
    }

    public ResponseEntity<Object> processResponse(@NonNull HttpStatus httpStatus, HttpHeaders headers, List<?> body) {
        final ResponseDTO response = ResponseDTO.builder()
                .status(httpStatus.value())
                .message("Success")
                .body(body)
                .build();
        return new ResponseEntity<>(response, headers, httpStatus);
    }
}
