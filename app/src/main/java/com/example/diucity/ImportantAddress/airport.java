package com.example.diucity.ImportantAddress;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.diucity.R;

public class airport extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airport);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null)
        {
            String title = "Airports";
            actionBar.setTitle(title);
        }

        final TextView textView1 = (TextView) findViewById(R.id.text1);
        Spannable text1 = new SpannableString("Information About Airport:");
        text1.setSpan(new ForegroundColorSpan(Color.BLUE),0,text1.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView1.setText(text1);

        final TextView textView2 = (TextView) findViewById(R.id.text2);
        Spannable text2 = new SpannableString("Airport Director:- Shafique U. Shah\n\nAddress:- Airports Authority of India Diu Airport ,Diu (Daman and Diu)-362520\n\nMobile No.:- 91-2875-275311\nPhone No.:- 91-2875-275365\nEmail:- apd_diu@aai.aero\n\nTerminal Manager Details:\nDiu Airport\n7575849497");
        text2.setSpan(new ForegroundColorSpan(Color.BLACK),0,text2.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView2.setText(text2);

        textView1.setTextIsSelectable(true);
        textView2.setTextIsSelectable(true);

        final ImageView imageView = (ImageView) findViewById(R.id.imageView2);
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