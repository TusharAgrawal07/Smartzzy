package com.example.diucity.ImportantAddress;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import com.example.diucity.R;

public class restaurant_and_cafe extends AppCompatActivity
{
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_and_cafe);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null)
        {
            String title = "Restaurants & Cafes";
            actionBar.setTitle(title);
        }

        final TextView textView1 = (TextView) findViewById(R.id.restaurant_and_cafe_text1);
        Spannable text1 = new SpannableString("Information About Restaurants & Cafes");
        text1.setSpan(new ForegroundColorSpan(Color.BLUE),0,text1.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView1.setText(text1);

        final TextView textView2 = (TextView) findViewById(R.id.restaurant_and_cafe_text2);
        Spannable text2 = new SpannableString("1.Tawa Tadka Diu\nAddress: Near Electric Complaint and Cash Collection Center, Diu, 362520\nHours: 11am-11pm\nRating: 4.7/5\nPhone: 097230 84321\nOrder: swiggy.com\nMap: https://g.page/tawatadka?share" +
                "\n\n2.Chamunda Restaurant\nAddress: Airport Rd, Diu, 362520\nPHours: 8am-4pm, 7pm-10pm\nRating: 4.0/5\nPhone: 094266 7635\nMap: https://goo.gl/maps/UhmtPF2K9UrXVbrM9" +
                "\n\n3.My Cafe, Diu\nAddress: Way To Gangeshwer, Fudam, Diu, 362520\nHours: 10am-11pm\nRating: 4.8/5\nMap: https://goo.gl/maps/7bkhwCUpYpifJWbf8" +
                "\n\n4.Blue Berry's Restaurant\nAddress: Fudam Near HP Petrol Pump, Nagoa Main Road, opp. S.P. Office, Fudam, Diu, 362520\nHours: 8am-10:30pm\nRating: 3.6/5\nPhone: 076218 80004\nMap: https://goo.gl/maps/NCH2xEBKytt43qWn8" +
                "\n\n5.Apaar Garden Open Restaurant\nAddress:  Fort Rd, Diu, 362520\nRating: 3.7/5\nMap: https://goo.gl/maps/Sc5bzy9x9U81sjmbA" +
                "\n\n6.APAAR Garden Restaurant\nAddress: PX9P+J45, Diu, 362520\nHours: 8am-11pm\nRating: 3.2/5\nMap: https://goo.gl/maps/hjT6CBi5DH4sbobZ9" +
                "\n\n7.TGH Restaurant\nAddress: Off Fort Road, Near Hotel Prince, Main Bazar, Diu, 362520\nHours: 9am-11pm\nRating: 4.2/5\nMap: https://goo.gl/maps/CFDozZ2qsykP4Gfw9" +
                "\n\n8.O Coqueiro\nAddress: Near diu museum, firangiwala, road, Diu\nHours: 8am-9pm\n4.3/5\nMap: https://goo.gl/maps/vMNNmQxtBZL7ESBp8" +
                "\n\n9.Rio Restaurant\nAddress: PX7C+M57, Airport Road, Diu, 362520\nHours: 9am–3pm, 6–8:30pm\nRating: 3.8/5\nMap:https://goo.gl/maps/sGNX4hzeby9xuyAN7" +
                "\n\n10.Khana khazana\nAddress: Jethibhai road, near lalshapir Dargha, Diu, 36252\nHours: 9am–10:30pm\nRating: 4.7/5\nMap:https://goo.gl/maps/VTziFmJjjPdJEZdP7" +
                "\n\n11.Apple bite foodz\nAddress:  Nr.Hotel Ankur, Diu, 362520\nHours: 9am–9pm\nRating: 5.0/5\nMap: https://g.page/apple-bite-foodz?share" +
                "\n\n12.Amigos The cafe\nAddress: St. Paul's church road,Opp Samrat Hotel, near veg. Market, Diu, 362520\nHours: 9:30am–10:30pm\nRating: 4.5/5\nMap: https://g.page/amigos-refreshment?share" +
                "\n\n13.Bamaniya Restaurant\nAddress: PX74+FJC, Kesariya-Diu Road, Diu, 362520\nHours: 8am–11pm\nRating: 3.7/5\nMap: https://goo.gl/maps/k7zJ5RCzF7AWNQrQA" +
                "\n\n14.Prince Restaurant\nAddress: Main Bazar, Diu, 362520\nHours: 9am–11pm\nRating: 3.8/5\nMap: https://goo.gl/maps/7e3DHzb915Z5Ak799" +
                "\n\n15.Annpurna Restaurant\nAddress: PX8M+5PG, Diu, 362520\nHours: 11:30am–3pm, 7:30–10pm\nRating: 4.1/5\nMap: https://goo.gl/maps/n7hXvAZxuV3EmFJN7"
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