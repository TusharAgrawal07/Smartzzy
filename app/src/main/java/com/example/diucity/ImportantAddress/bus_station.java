package com.example.diucity.ImportantAddress;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

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

public class bus_station extends AppCompatActivity
{
    private AlertDialog mAlertDialog;
    private AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_station);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null)
        {
            String title = "Bus Stations";
            actionBar.setTitle(title);
        }

        final TextView textView1 = (TextView) findViewById(R.id.bus_text1);
        Spannable text1 = new SpannableString("Information About Bus Stations:");
        text1.setSpan(new ForegroundColorSpan(Color.BLUE),0,text1.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView1.setText(text1);

        final TextView textView2 = (TextView) findViewById(R.id.bus_text2);
        Spannable text2 = new SpannableString("1.Diu bus stand PX9J+8CX, Diu, 362520\n\n2.Diu Jethibhai bus stand GJ SH 232, Diu, 362520\n\n3.Bus Depot, Diu, 362520\n4.Vanakbara Bus Stop, PV8G+JPV, Vanakbara, 362570");
        text2.setSpan(new ForegroundColorSpan(Color.BLACK),0,text2.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView2.setText(text2);

        textView1.setTextIsSelectable(true);
        textView2.setTextIsSelectable(true);

        final ImageView imageView = (ImageView) findViewById(R.id.imageView);
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
}