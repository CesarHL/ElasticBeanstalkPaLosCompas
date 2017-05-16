package com.awseb.logic;

import com.awseb.model.Result;
import org.springframework.stereotype.Component;

@Component
public class Convertion {

    double f = 98.4;
    double c;

    public Result convert() {
        c = (f - 32) * 5 / 9;
        Result result = new Result();
        result.setCelcius(c);
        return result;
    }
    
    public Result convert(double f) {
        c = (f - 32) * 5 / 9;
        Result result = new Result();
        result.setCelcius(c);
        return result;
    }

}
