package com.blacklotus.service.models.response;

import com.blacklotus.service.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

@ToString
public class Category implements Model {

    @JsonProperty("description")
    private String description;

    @JsonProperty("id")
    private String id;

    @JsonProperty("category")
    private String category;
}