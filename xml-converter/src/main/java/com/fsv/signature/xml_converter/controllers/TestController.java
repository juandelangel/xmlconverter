package com.fsv.signature.xml_converter.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;


@RestController
public class TestController {

    private static final Logger LOGGER = Logger.getLogger(TestController.class.getName());
    @PostMapping(value="/xml")
    public ResponseEntity<String> test(@RequestBody String request){
        LOGGER.info("input:"+request);
        return ResponseEntity.ok().body("");
    }
}
