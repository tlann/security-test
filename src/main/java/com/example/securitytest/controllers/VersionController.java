package com.example.securitytest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @Autowired
    JwtDecoder jwtDecoder;

    public VersionController() {
        if (jwtDecoder == null) {
            throw new RuntimeException("Unable to Autowire jwtDecoder");
        }
    }

    @GetMapping(value="/v1/version")
    ResponseEntity<String> getVersion() {
        return new ResponseEntity<>("Omega", HttpStatus.OK);
    }
}
