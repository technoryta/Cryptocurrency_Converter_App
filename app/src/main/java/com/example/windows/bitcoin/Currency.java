package com.example.windows.bitcoin;

/**
 * Created by Windows on 05/11/2017.
 */


public class Currency {

    private String currency;


    private String rate;



    public Currency(String currencies, String rates)
    {
        currency = currencies;
        rate= rates;

    }

    public String getCurrency() {

        return currency;
    }



    public String getRate() {

        return rate;
    }

    /**

     */


}


