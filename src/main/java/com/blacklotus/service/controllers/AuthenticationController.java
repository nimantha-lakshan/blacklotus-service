package com.blacklotus.service.controllers;

import com.blacklotus.service.common.controllers.AbstractRestController;
import com.blacklotus.service.models.request.UserModel;
import com.blacklotus.service.services.AuthenticationRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.blacklotus.service.common.Constants.API_VERSION;

@RestController
@RequestMapping(value = API_VERSION + "/auth")
public class AuthenticationController extends AbstractRestController {

    private final AuthenticationRestService service;

    @Autowired
    public AuthenticationController(AuthenticationRestService service) {
        this.service = service;
    }

    @PostMapping(path = "/signin")
    public ResponseEntity<Object> userSignIn(@RequestBody UserModel user) {
        return this.processResponse(HttpStatus.OK, null, user);
    }
}
