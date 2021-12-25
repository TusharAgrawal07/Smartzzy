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

public class taxi_service extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taxi_service);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null)
        {
            String title = "Taxi Service";
            actionBar.setTitle(title);
        }

        final TextView textView1 = (TextView) findViewById(R.id.taxi_service_text1);
        Spannable text1 = new SpannableString("Information About Taxi Services in Diu:");
        text1.setSpan(new ForegroundColorSpan(Color.BLUE),0,text1.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView1.setText(text1);

        final TextView textView2 = (TextView) findViewById(R.id.taxi_service_text2);
        Spannable text2 = new SpannableString("There are two Texi Service available in Diu city:\n\n1.Diu Taxi Service:\nAddress: Bandar chowk, Bhavsarwada, Diu, 396210\nAreas served: Gujarat and nearby areas\nRating: 4.8/5\n\n2.Diu Airport Taxi Service:\nAddress: PX7P+QW9, Panchvati, Diu, 362520\n\nMore Info:-\nWebsite 1: https://www.clearcarrental.com/daman-to-diu\nWebsite 2: https://www.makemytrip.com/car-rental/diu-city-cabs.html");
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