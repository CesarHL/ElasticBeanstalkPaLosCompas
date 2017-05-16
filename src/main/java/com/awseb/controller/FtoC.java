package com.awseb.controller;

import com.awseb.logic.Convertion;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FtoC {

    @Autowired
    Convertion convertionService;

    @RequestMapping(value = "/Temp", method = RequestMethod.GET)
    public ResponseEntity<Optional> convertTemp() {

        return new ResponseEntity(convertionService.convert(), HttpStatus.OK);
    }

    @RequestMapping(value = "/Temp/{f}", method = RequestMethod.GET)
    public ResponseEntity<Optional> convertParameter(@PathVariable("f") double f) {

        return new ResponseEntity(convertionService.convert(f), HttpStatus.OK);
    }

}
