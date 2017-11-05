package com.example.windows.bitcoin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class ConvertActivity extends AppCompatActivity {


    private double rate;
    private double value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert);

        Bundle extras = getIntent().getExtras();
        if (extras!=null){
            rate = extras.getDouble("key");
        }


    }


    public void submitAnswer(View view) {
        EditText answer = (EditText) findViewById(R.id.textentry);
        String message = answer.getText().toString();
        if (message.length()==0 ){

            Toast.makeText(getApplicationContext(), "Enter a Currency Value", Toast.LENGTH_SHORT).show();
        }
        else{

            value = (double) Integer.parseInt(message);

            Convert conv = new Convert(rate, value);
            String ans = String.valueOf(conv.convertedCurrency());

            Toast.makeText(getApplicationContext(), "The Amount is  " + ans +  " BTC", Toast.LENGTH_LONG).show();

        }
    }
}

