package com.blacklotus.service.controllers;

import com.blacklotus.service.common.controllers.AbstractRestController;
import com.blacklotus.service.common.controllers.IRestController;
import com.blacklotus.service.models.response.ApiResponse;
import com.blacklotus.service.services.ProductRestService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/service")
public class ProductsRestController extends AbstractRestController implements IRestController {

    private final ProductRestService productRestService;

    @Autowired
    public ProductsRestController(ProductRestService productRestService) {
        this.productRestService = productRestService;
    }

    @GetMapping
    public ResponseEntity<Object> getSample() {
        ApiResponse forObject = productRestService.getRestTemplate().getForObject("http://localhost:8080/api/v1/product/", ApiResponse.class);
        return new ResponseEntity<>(forObject.toString(), null, HttpStatus.OK);
    }
}
