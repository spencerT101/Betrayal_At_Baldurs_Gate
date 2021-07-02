package com.example.BetrayalAtBaldursGate.controllers;

import com.example.BetrayalAtBaldursGate.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping(value = "/test/{name}")
    public ResponseEntity sayHelloToName(@PathVariable String name) {
        return new ResponseEntity (testService.helloSpencer(name), HttpStatus.OK);
    }

}

