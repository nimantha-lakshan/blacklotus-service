package com.blacklotus.service.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

import java.util.List;

@ToString
public class ApiResponse {

    @JsonProperty("status")
    private int status;

    @JsonProperty("message")
    private String message;

    @JsonProperty("body")
    private List<Product> body;

    @JsonProperty("time_stamp")
    private String timeStamp;
}