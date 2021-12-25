package com.example.diucity.TravelDetails;

import android.graphics.Color;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import com.example.diucity.R;

public class tour_and_travels extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_and_travels);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null)
        {
            String title = "Tour & Travels";
            actionBar.setTitle(title);
        }

        final TextView textView1 = (TextView) findViewById(R.id.tour_and_travels_text1);
        Spannable text1 = new SpannableString("Information About Tour & Travels in Diu:");
        text1.setSpan(new ForegroundColorSpan(Color.BLUE),0,text1.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView1.setText(text1);

        final TextView textView2 = (TextView) findViewById(R.id.tour_and_travels_text2);
        Spannable text2 = new SpannableString("1.DARSHAN Tour And Travels Diu\nAddress: Hotel Prabhat Beach Resort, Nagoa Beach, Diu, 362520\nAreas served: Diu\nRating: 5.0/5" +
                "\n\n2.Diu Tours & Travels\nAddress: opp. Amarvadi Panibai School, Diu, 396210\nAreas served: Diu\nRating: 4.8/5" +
                "\n\n3.A to Z travel Diu\nAddress: Vaniya Street, Panchvati, Diu, 362520\nPhone: 098254 63245\nHours: 9am–9pm\nRating: 3.8/5" +
                "\n\n4.Suvidha Tours & Travels\nAddress: Jethibhai bas station, Diu, 362560\nPhone: 098254 63245\nHours: 9am–9pm\nRating: 3.8/5" +
                "\n\n5.Tourism Office, Diu\nAddress: 3-355/3,Panchavati Road, near Pranami Mandir & Dena Bank, Diu, 362520\nHours: 8am–10p\nRating: 4.3/5\nMore Info.: http://www.diutourism.com/"
                );
        text2.setSpan(new ForegroundColorSpan(Color.BLACK),0,text2.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView2.setText(text2);

        textView1.setTextIsSelectable(true);
        textView2.setTextIsSelectable(true);
    }
    protected void onDestroy() { super.onDestroy(); }
}