package com.awseb.model;

public class Result {

    double celcius;

    public Result() {
    }

    public double getCelcius() {
        return celcius;
    }

    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }

    @Override
    public String toString() {
        return "Result{" + "celcius=" + celcius + '}';
    }

}
