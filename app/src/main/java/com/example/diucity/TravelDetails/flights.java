package com.example.diucity.TravelDetails;

import android.graphics.Color;
import androidx.appcompat.app.ActionBar;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.diucity.R;

public class flights extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flights);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null)
        {
            String title = "Flights";
            actionBar.setTitle(title);
        }

        final TextView textView1 = (TextView) findViewById(R.id.flights_text1);
        Spannable text1 = new SpannableString("Information About Flights in Diu:");
        text1.setSpan(new ForegroundColorSpan(Color.BLUE),0,text1.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView1.setText(text1);

        final TextView textView2 = (TextView) findViewById(R.id.flights_text2);
        Spannable text2 = new SpannableString("There is one Airport in Diu (Details given in Important Addresses Part).\n\nIf you want to reach diu by flights, firstly you need to reach Mumbai or Ahmedabad airports from any city of India or any country.\n\nThere are direct flights from Mumbai to Diu.\n\nThere are some flights available from Ahmedabad under Udaan Scheme.");
        text2.setSpan(new ForegroundColorSpan(Color.BLACK),0,text2.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView2.setText(text2);

        textView1.setTextIsSelectable(true);
        textView2.setTextIsSelectable(true);
    }
    protected void onDestroy()
    {
        super.onDestroy();
    }
}