package com.example.diucity.ImportantAddress;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import com.example.diucity.R;

public class ayushman_bharat extends AppCompatActivity
{
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayushman_bharat);
        ActionBar actionBar = getSupportActionBar();

        if(actionBar!=null)
        {
            String title = "Hospitals";
            actionBar.setTitle(title);
        }

        final TextView textView1 = (TextView) findViewById(R.id.ayushman_bharat_text1);
        Spannable text1 = new SpannableString("Ayushman Bharat - Diu");
        text1.setSpan(new ForegroundColorSpan(Color.BLUE),0,text1.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView1.setText(text1);

        final TextView textView2 = (TextView) findViewById(R.id.ayushman_bharat_text2);
        Spannable text2 = new SpannableString("Address: Diu Hospital, 362520\n\nHours:\nMonday 10am–1pm, 3pm–5pm\nTuesday 10am-1:30pm, 3pm–5:30pm\nWednesday 10am–1pm, 3pm–5pm\nThursday 10am–1pm, 3pm–5pm\nFriday 10am–1pm, 3pm–5pm\nSaturday  Closed\nSunday  Closed");
        text2.setSpan(new ForegroundColorSpan(Color.BLACK),0,text2.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView2.setText(text2);

        TextView textView3 = (TextView) findViewById(R.id.ayushman_bharat_text4);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView4 = (TextView) findViewById(R.id.ayushman_bharat_text3);
        textView4.setMovementMethod(LinkMovementMethod.getInstance());

        textView1.setTextIsSelectable(true);
        textView2.setTextIsSelectable(true);
    }
    protected void onDestroy()
    {
        super.onDestroy();
    }
}