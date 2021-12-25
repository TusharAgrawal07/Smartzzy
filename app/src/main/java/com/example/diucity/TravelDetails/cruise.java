package com.example.diucity.TravelDetails;

import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.diucity.R;

public class cruise extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cruise);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null)
        {
            String title = "Cruise";
            actionBar.setTitle(title);
        }

        final TextView textView1 = (TextView) findViewById(R.id.cruise_text1);
        Spannable text1 = new SpannableString("Information About Cruise in Diu:");
        text1.setSpan(new ForegroundColorSpan(Color.BLUE),0,text1.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView1.setText(text1);

        final TextView textView2 = (TextView) findViewById(R.id.cruise_text2);
        Spannable text2 = new SpannableString("You can reach Diu by cruise from Mumbai or Surat cities.There are three different Cruise Services available from Mumbai and one Cruise Sevice available from surat.\n\nMumbai to Diu:\n 1.Weekend Cruises\n 2.Family Cruises\n 3.Seaction to diu\nMore Info.: https://www.cordeliacruises.com/cruise-destinations/cruise-to-diu\n\nSurat to Diu:\n 1.Hazira-Diu-Hazira\nMore Info.: https://mumbaimaiden.com/events/surat-diu-surat/");
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