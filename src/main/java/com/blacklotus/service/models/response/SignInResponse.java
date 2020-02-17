package com.blacklotus.service.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SignInResponse {

    @JsonProperty("time_stamp")
    private String timeStamp;

    @JsonProperty("message")
    private String message;

    @JsonProperty("body")
    private Body body;

    @JsonProperty("status")
    private int status;
}