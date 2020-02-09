package com.blacklotus.service.controllers;

import com.blacklotus.service.common.controllers.AbstractRestController;
import com.blacklotus.service.common.controllers.IRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/service")
public class ProductsRestController extends AbstractRestController implements IRestController {

    @GetMapping
    public ResponseEntity<Object> getSample() {
        return new ResponseEntity<>("Test", null, HttpStatus.OK);
    }
}
