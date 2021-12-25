package com.example.diucity.ImportantAddress;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.diucity.R;

public class government_hospital extends AppCompatActivity
{
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_government_hospital);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null)
        {
            String title = "Hospitals";
            actionBar.setTitle(title);
        }

        final TextView textView1 = (TextView) findViewById(R.id.government_hospital_text1);
        Spannable text1 = new SpannableString("Government Hospital - Diu");
        text1.setSpan(new ForegroundColorSpan(Color.BLUE),0,text1.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView1.setText(text1);

        final TextView textView2 = (TextView) findViewById(R.id.government_hospital_text2);
        Spannable text2 = new SpannableString("Address: PX8H+579, Police Quarters Road, Behind St Paul Church, Diu, 362520\n\nHours: Open 24 hours\n\nPhone: 02875 252 480\n\nRating: 3.1/5");
        text2.setSpan(new ForegroundColorSpan(Color.BLACK),0,text2.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView2.setText(text2);

        TextView textView3 = (TextView) findViewById(R.id.government_hospital_text3);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView4 = (TextView) findViewById(R.id.government_hospital_text4);
        textView4.setMovementMethod(LinkMovementMethod.getInstance());

        textView1.setTextIsSelectable(true);
        textView2.setTextIsSelectable(true);

        final ImageView imageView = (ImageView) findViewById(R.id.imageView6);
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