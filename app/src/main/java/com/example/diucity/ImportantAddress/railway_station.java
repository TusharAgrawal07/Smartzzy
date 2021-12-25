package com.example.diucity.ImportantAddress;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import com.example.diucity.R;

public class railway_station extends AppCompatActivity
{
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_railway_station);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null)
        {
            String title = "Railway Stations";
            actionBar.setTitle(title);
        }

        final TextView textView1 = (TextView) findViewById(R.id.railway_text1);
        Spannable text1 = new SpannableString("Information About Railway Stations:");
        text1.setSpan(new ForegroundColorSpan(Color.BLUE),0,text1.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView1.setText(text1);

        final TextView textView2 = (TextView) findViewById(R.id.railway_text2);
        Spannable text2 = new SpannableString("Some nearest Railway Stations from Diu City:\n\n1.Delvada Railway Station\nDistance: 11 Kilometres\n\n2.Kodinar Railway Station\nDistance: 54 Kilometres\n\n3.Veraval Railway Station\nDistance: 90 Kilometres\n\n4.Junagadh Railway Station\nDistance: 157 Kilometres\n\nHow to reach diu by Train:\nYou can get train from Ahmedabad, Vadodara, Rajkot, Surat etc. to Railway junctions given above and then you can reach diu by road from that junctions.");
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