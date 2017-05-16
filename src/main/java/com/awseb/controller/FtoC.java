package com.awseb.controller;

import com.awseb.logic.Convertion;
import com.awseb.model.Result;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FtoC {

    @RequestMapping(value = "/Temp", method = RequestMethod.GET)
    public ResponseEntity<Optional> convertTemp() {
        Convertion convertion = new Convertion();
        Result result = convertion.Convert();
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @RequestMapping(value = "/Temp/{f}", method = RequestMethod.GET)
    public ResponseEntity<Optional> convertParameter(@PathVariable("f") double f) {
        Convertion convertion = new Convertion();
        Result result = convertion.Convert(f);
        return new ResponseEntity(result, HttpStatus.OK);
    }

}
