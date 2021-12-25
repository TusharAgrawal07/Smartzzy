package com.example.diucity.ImportantAddress;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.diucity.R;

public class hospital extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null)
        {
            String title = "Hospitals";
            actionBar.setTitle(title);
        }

        final TextView textView1 = (TextView) findViewById(R.id.hospital_text1);
        Spannable text1 = new SpannableString("Information About Hospitals:");
        text1.setSpan(new ForegroundColorSpan(Color.BLUE),0,text1.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView1.setText(text1);

        final TextView textView2 = (TextView) findViewById(R.id.hospital_text2);
        Spannable text2 = new SpannableString("Here given some information about Hospitals of Diu city and surrounding area.");
        text2.setSpan(new ForegroundColorSpan(Color.BLACK),0,text2.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView2.setText(text2);

        textView1.setTextIsSelectable(true);
        textView2.setTextIsSelectable(true);

        ListView listView = findViewById(R.id.hospitals_list);
        final String[] text = {"Government hospital","Old Government hospital","Community Health Centre","Primary Health Centre","Ayushman Bharat"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, text);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                switch(position)
                {
                    case 0:
                    { Intent intent = new Intent(getApplicationContext(), government_hospital.class);
                        startActivity(intent);
                        break;}
                    case 1:
                    { Intent intent = new Intent(getApplicationContext(), old_government_hospital.class);
                        startActivity(intent);
                        break;}
                    case 2:
                    { Intent intent = new Intent(getApplicationContext(), community_health_center.class);
                        startActivity(intent);
                        break;}
                    case 3:
                    { Intent intent = new Intent(getApplicationContext(), primary_health_center.class);
                        startActivity(intent);
                        break;}
                    case 4:
                    { Intent intent = new Intent(getApplicationContext(), ayushman_bharat.class);
                        startActivity(intent);
                        break;}
                }
            }
        });
    }
    protected void onDestroy()
    {
        super.onDestroy();
    }
}