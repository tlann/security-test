package com.example.securitytest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @GetMapping(value="/v1/version")
    ResponseEntity<String> getVersion() {
        return new ResponseEntity<>("Omega", HttpStatus.OK);
    }

    @GetMapping(value="/v1/scheduled")
    ResponseEntity<String> getScheduled() {

        //This would get the latest results of the scheduled event
        return new ResponseEntity<>("Scheduled results", HttpStatus.OK);
    }
}
