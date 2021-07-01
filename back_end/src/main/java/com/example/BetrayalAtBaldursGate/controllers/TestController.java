package com.example.BetrayalAtBaldursGate.controllers;

import com.example.BetrayalAtBaldursGate.services.TestService;
import com.example.BetrayalAtBaldursGate.tiles.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


public class TestController {

    @Autowired
    TestService testService;

    @GetMapping(value = "/test/{name}")
    public ResponseEntity sayHelloToName(@PathVariable String name) {
          return new ResponseEntity (testService.greet(name), HttpStatus.OK);
    }

}




//
//    @GetMapping(value = "/distilleries")
//    public ResponseEntity getAllDistilleriesAndFilters(
//            @RequestParam(required = false, name = "region") String region,
//            @RequestParam(required = false, name = "whiskyAge") Integer whiskyAge)
//
//}
