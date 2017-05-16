package com.awseb.logic;

import com.awseb.model.Result;

public class Convertion {

    double f = 98.4;
    double c;

    public Result Convert() {
        c = (f - 32) * 5 / 9;
        Result result = new Result();
        result.setCelcius(c);
        return result;
    }
    
    public Result Convert(double f) {
        c = (f - 32) * 5 / 9;
        Result result = new Result();
        result.setCelcius(c);
        return result;
    }

}
