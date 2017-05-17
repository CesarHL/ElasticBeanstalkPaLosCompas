package com.awseb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "result")
public class Result {

    @Id
    Integer idResult;
    
    Double celcius;

    public Result() {
    }

    public Result(Integer idResult, Double celcius) {
        this.idResult = idResult;
        this.celcius = celcius;
    }

    public Integer getIdResult() {
        return idResult;
    }

    public void setIdResult(Integer idResult) {
        this.idResult = idResult;
    }

    public Double getCelcius() {
        return celcius;
    }

    public void setCelcius(Double celcius) {
        this.celcius = celcius;
    }

    @Override
    public String toString() {
        return "Result{" + "idResult=" + idResult + ", celcius=" + celcius + '}';
    }

}
