package com.blacklotus.service.models.response;

import com.blacklotus.service.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

@ToString
public class Product implements Model {

    @JsonProperty("name")
    private String name;

    @JsonProperty("active")
    private boolean active;

    @JsonProperty("id")
    private String id;

    @JsonProperty("category")
    private Category category;
}