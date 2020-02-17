package com.blacklotus.service.controllers;

import com.blacklotus.service.common.controllers.AbstractRestController;
import com.blacklotus.service.common.controllers.IRestController;
import com.blacklotus.service.services.ProductRestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.blacklotus.service.common.Constants.API_VERSION;

@RestController
@RequestMapping(API_VERSION + "/product")
@Slf4j
public class ProductsRestController extends AbstractRestController implements IRestController {

    private final ProductRestService productRestService;

    @Autowired
    public ProductsRestController(ProductRestService productRestService) {
        this.productRestService = productRestService;
    }

    @GetMapping
    public ResponseEntity<Object> getSample(@RequestHeader HttpHeaders headers) {
        log.info(headers.toSingleValueMap().toString());
        return this.processResponse(HttpStatus.OK, headers, this.productRestService.findAll());
    }
}
