package com.example.windows.bitcoin;

/**
 * Created by Windows on 05/11/2017.
 */

public class Convert {

    private double rate;
    private double value;
    private double answer;

    public Convert(double rates,  double values){

        rate = rates;
        value = values;
    }

    public double getRate(){
        return rate;
    }
    public double getValue(){
        return value;
    }
    public double convertedCurrency (){
        answer = value/ rate;
        return answer;
    }
}




