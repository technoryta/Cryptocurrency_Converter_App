package com.example.windows.bitcoin;



import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class CurrencyAdapter extends ArrayAdapter<Currency> {

    private static final String LOG_TAG = CurrencyAdapter.class.getSimpleName();



    public CurrencyAdapter(Activity context, ArrayList<Currency> currencies) {

        super(context, 0, currencies);
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Currency currentCurrency = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.currency);

        nameTextView.setText(currentCurrency.getCurrency());


        TextView numberTextView = (TextView) listItemView.findViewById(R.id.rate);

        numberTextView.setText(currentCurrency.getRate());

        return listItemView;
    }



}
