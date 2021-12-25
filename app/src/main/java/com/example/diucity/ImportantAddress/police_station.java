package com.example.diucity.ImportantAddress;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.diucity.R;

public class police_station extends AppCompatActivity
{
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_station);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null)
        {
            String title = "Police Stations";
            actionBar.setTitle(title);
        }

        final TextView textView1 = (TextView) findViewById(R.id.police_text1);
        Spannable text1 = new SpannableString("Information About Police Stations:");
        text1.setSpan(new ForegroundColorSpan(Color.BLUE),0,text1.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView1.setText(text1);

        final TextView textView2 = (TextView) findViewById(R.id.police_text2);
        Spannable text2 = new SpannableString("1.Diu Police Station\nAddress: Collector Office, Fort Main Road, Opposite, Diu, 362520\nPhone: 02875 252 133\n\n2.District Police Headquarters\nAddress: Kesariya - Diu Rd, 362520\n\n3.District Superintendent Of Police Office\nAddress: PX86+239, Diu, 362520\n\n4.Ghoghla Outpost Police Station\nAddress: Jetty Rd, Sabzi Market, Ghoghola, 362540\nHours: Open 24 hours\nPhone: 02875 252 113\n\n5.Police Booth\nAddress: PX9P+G9J, Diu, 36252\n\n6.Check Post Diu\nAddress: Diu-Una Rd, Ghoghola, Gujarat 362510\nHours: Open 24 hours");
        text2.setSpan(new ForegroundColorSpan(Color.BLACK),0,text2.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView2.setText(text2);

        textView1.setTextIsSelectable(true);
        textView2.setTextIsSelectable(true);

        final ImageView imageView = (ImageView) findViewById(R.id.imageView3);
        imageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(view.getScaleX()==1)
                {
                    view.setScaleX((float) 1.33);
                    view.setScaleY(2);
                }
                else
                {
                    view.setScaleX(1);
                    view.setScaleY(1);
                }
            }
        });
    }
    protected void onDestroy()
    {
        super.onDestroy();
    }
}