package com.example.windows.bitcoin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    private double rate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an ArrayList of Currency objects
        final ArrayList<Currency> currencies = new ArrayList<>();

        currencies.add(new Currency("Ethereum (ETH) to Bitcoin (BTC)", "1 BTC = 24.3 ETH"));
        currencies.add(new Currency("Nigerian Naira (NGN) to Bitcoin (BTC)", "1 BTC = 2684332.7 NGN"));
        currencies.add(new Currency("US Dollar (USD) to Bitcoin (BTC)", "1 BTC = 7508.87 USD"));
        currencies.add(new Currency("Euro (EUR) to Bitcoin (BTC)", "1 BTC = 6513.64 EUR"));
        currencies.add(new Currency("Pound (GBP) to Bitcoin (BTC)", "1 BTC = 5777.29 GBP"));

        currencies.add(new Currency("South Korean Won (KRW) to Bitcoin (BTC)", "1 BTC = 85115350.7 KRW"));
        currencies.add(new Currency("South African Rand (ZAR) to Bitcoin (BTC)", "1 BTC = 116808.1 ZAR"));
        currencies.add(new Currency("Danish Krone (DKK) to Bitcoin (BTC)", "1 BTC = 48401.8 DKK"));
        currencies.add(new Currency("Norwegian Krone (NOK) to Bitcoin (BTC)", "1 BTC = 62981.2 NOK"));
        currencies.add(new Currency("Brazilian Real (BRL) to Bitcoin (BTC)", "1 BTC = 25617.8 BRL"));

        currencies.add(new Currency("Japanese Yen (ETH) to Bitcoin (BTC)", "1 BTC = 857567.8 JPY"));
        currencies.add(new Currency("Polish Zloty (PLN) to Bitcoin (BTC)", "1 BTC = 27480.1 PLN"));
        currencies.add(new Currency("Swedish Krona (SEK) to Bitcoin (BTC)", "1 BTC = 64800 SEK"));
        currencies.add(new Currency("Mexican Peso (MXN) to Bitcoin (BTC)", "1 BTC = 145457.7 MXN"));
        currencies.add(new Currency("Russian Ruble (RUB) to Bitcoin (BTC)", "1 BTC = 432501 RUB"));

        currencies.add(new Currency("Australian Dollar (AUD) to Bitcoin (BTC)", "1 BTC = 9833.42 AUD"));
        currencies.add(new Currency("United Arab Emirate Dirham (AED) to Bitcoin (BTC)", "1 BTC = 28249.9 AED"));
        currencies.add(new Currency("Hong Kong Dollar (HKD) to Bitcoin (BTC)", "1 BTC = 58699 HKD"));
        currencies.add(new Currency("Canadian Dollar (CAD) to Bitcoin (BTC)", "1 BTC = 9693.35 CAD"));
        currencies.add(new Currency("Czech Koruna(CZK) to Bitcoin (BTC)", "1 BTC = 169067.7 CZK"));;
        currencies.add(new Currency("Chinese Yuan (CNY) to Bitcoin (BTC)", "1 BTC = 49702.4 CNY"));





        // Create an {@link CurrencyAdapter}, whose data source is a list of
        // {@link Currency}s. The adapter knows how to create list item views for each item
        // in the list.
        final CurrencyAdapter currencyAdapter = new CurrencyAdapter(this, currencies);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_currency);
        listView.setAdapter(currencyAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                int pos =parent.getPositionForView(view);


                switch (pos)

                {
                    case 0:
                        rate = 24.3;
                        break;
                    case 1:
                        rate = 2684332.7;
                        break;
                    case 2:
                        rate = 7508.87;
                        break;
                    case 3:
                        rate = 6513.64;
                        break;
                    case 4:
                        rate = 5777.29;
                        break;
                    case 5:
                        rate = 8515350.7;
                        break;
                    case 6:
                        rate = 116808.1;
                        break;
                    case 7:
                        rate = 48401.8;
                        break;
                    case 8:
                        rate = 62981.2;
                        break;
                    case 9:
                        rate = 25617.8;
                        break;
                    case 10:
                        rate = 857567.8;
                        break;

                    case 11:
                        rate = 27480.1;
                        break;
                    case 12:
                        rate = 64800;
                        break;
                    case 13:
                        rate = 145457.7;
                        break;
                    case 14:
                        rate = 432501;
                        break;
                    case 15:
                        rate = 9833.42;
                        break;
                    case 16:
                        rate = 28249.9;
                        break;
                    case 17:
                        rate = 58699;
                        break;
                    case 18:
                        rate = 9693.35;
                        break;
                    case 19:
                        rate = 169067.7;
                        break;
                    case 20:
                        rate = 49702.4;
                        break;



                }
                Intent newActivity = new Intent(MainActivity.this, ConvertActivity.class);
                newActivity.putExtra("key", rate);
                startActivity(newActivity);
            }

        });


    }

}

