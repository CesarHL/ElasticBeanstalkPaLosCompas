package com.awseb.controller;

import com.awseb.logic.Convertion;
import com.awseb.model.Result;
import com.awseb.repository.TempRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class FtoC {

    @Autowired
    @Qualifier("TempRepository")
    TempRepository tempService;

    @RequestMapping(value = "/Temp", method = RequestMethod.GET)
    public ResponseEntity<Optional> convertTemp() {
        
        Convertion con = new Convertion();
        Result result = con.convert();
        tempService.insert(result);
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @RequestMapping(value = "/Temp/{f}", method = RequestMethod.GET)
    public ResponseEntity<Optional> convertParameter(@PathVariable("f") double f) {

        return new ResponseEntity( HttpStatus.OK);
    }

    @RequestMapping(value = "/Temp", method = RequestMethod.POST)
    public ResponseEntity<Void> createLog(@RequestBody Result result, UriComponentsBuilder uriBuilder) {

        tempService.insert(result);
        System.out.println("GUARDAAAAAAAAAAAAAAAAADO");
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
