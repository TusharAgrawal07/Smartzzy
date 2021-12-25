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

public class buses_and_trains extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buses_and_trains);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null)
        {
            String title = "Buses & Trains";
            actionBar.setTitle(title);
        }

        final TextView textView1 = (TextView) findViewById(R.id.buses_and_trains_text1);
        Spannable text1 = new SpannableString("Information About Buses & Trains in Diu:");
        text1.setSpan(new ForegroundColorSpan(Color.BLUE),0,text1.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView1.setText(text1);

        final TextView textView2 = (TextView) findViewById(R.id.buses_and_trains_text2);
        Spannable text2 = new SpannableString("1.Buses:\nGSRTC bus service connect Diu to all the cities and towns of Gujarat.You can get direct buses for Diu from some cities.If there are no direct buses available for Diu, so you can reach nearby stations of diu by buses like Veraval, Una, Kodinar etc.and then there are directs buses available for diu from above junctions." +
                "\n\n2.Trains:\nThere is no Railway Station available in diu. There are trains available from any city of Gujarat or India to nearby railway stations of Diu.you must need to reach nearby stations like Delvada, Kodinar, Veraval, Harmadiya etc. by train and then you can reach diu by road from above junctions.\n\nMore Info.: https://www.indiatravelforum.in/threads/nearest-railway-station-to-diu.3351/"
                );
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