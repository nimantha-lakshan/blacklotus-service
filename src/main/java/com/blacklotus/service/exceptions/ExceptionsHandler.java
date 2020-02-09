package com.blacklotus.service.exceptions;

import com.blacklotus.service.dto.ExceptionDTO;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.procedure.NamedParametersNotSupportedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestControllerAdvice
@Slf4j
public class ExceptionsHandler {

    private final ExceptionDTO errorDTO;

    public ExceptionsHandler(@Autowired ExceptionDTO exceptionDTO) {
        this.errorDTO = exceptionDTO;
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<ExceptionDTO> handleUrlNotFound(NoHandlerFoundException e) {
        return processErrorResponse(null, HttpStatus.NOT_FOUND, e);
    }

    @ExceptionHandler(HttpMediaTypeNotAcceptableException.class)
    public ResponseEntity<ExceptionDTO> ha(HttpMediaTypeNotAcceptableException e) {
        return processErrorResponse(new HttpHeaders(), HttpStatus.BAD_GATEWAY, e);
    }

    @ExceptionHandler(NamedParametersNotSupportedException.class)
    public ResponseEntity<ExceptionDTO> invalidParametersException(NamedParametersNotSupportedException e) {
        return processErrorResponse(null, HttpStatus.BAD_REQUEST, e);
    }

    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<ExceptionDTO> unauthorizedException(UnauthorizedException e) {
        return processErrorResponse(null, HttpStatus.UNAUTHORIZED, e);
    }

    @ExceptionHandler({RuntimeException.class, Exception.class})
    public ResponseEntity<ExceptionDTO> handleRuntimeException(RuntimeException e) {
        return processErrorResponse(new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, e);
    }

    private ResponseEntity<ExceptionDTO> processErrorResponse(HttpHeaders headers,
                                                              HttpStatus httpStatus,
                                                              Exception ex) {
        log.error(ex.getMessage(), ex);
        this.errorDTO.setStatus(httpStatus.value());
        this.errorDTO.setMessage(ex.getMessage());
        this.errorDTO.setTimeStamp(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z").format(new Date()));
        if (ex instanceof NoHandlerFoundException) {
            this.errorDTO.setMessage("Failed, Path not found '" + ((NoHandlerFoundException) ex).getRequestURL() + "'");
        }

        if (headers == null) {
            return new ResponseEntity<>(this.errorDTO, httpStatus);
        } else {
            return new ResponseEntity<>(this.errorDTO, headers, httpStatus);
        }
    }
}
