package com.example.diucity.ImportantAddress;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.diucity.R;

public class important_addresses extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_important_addresses);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null)
        {
            String title = "Important Addresses";
            actionBar.setTitle(title);
        }

        ListView listView = findViewById(R.id.address_list);
        final String[] text = {"Airports","Bus Stations","Railway Stations","Police Stations","Hospitals",
                               "Government Blocks","Restaurants & Cafes"};

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
                    {Toast toast = Toast.makeText(getApplicationContext(), "Airports", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.BOTTOM,0,0);toast.show();
                        Intent intent = new Intent(getApplicationContext(), airport.class);
                        startActivity(intent);
                        break;}
                    case 1:
                    {Toast toast = Toast.makeText(getApplicationContext(), "Bus Stations", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.BOTTOM,0,0);toast.show();
                        Intent intent = new Intent(getApplicationContext(), bus_station.class);
                        startActivity(intent);
                        break;}
                    case 2:
                    {Toast toast = Toast.makeText(getApplicationContext(), "Railway Stations", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.BOTTOM,0,0);toast.show();
                        Intent intent = new Intent(getApplicationContext(), railway_station.class);
                        startActivity(intent);
                        break;}
                    case 3:
                    {Toast toast = Toast.makeText(getApplicationContext(), "Police Stations", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.BOTTOM,0,0);toast.show();
                        Intent intent = new Intent(getApplicationContext(), police_station.class);
                        startActivity(intent);
                        break;}
                    case 4:
                    {Toast toast = Toast.makeText(getApplicationContext(), "Hospitals", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.BOTTOM,0,0);toast.show();
                        Intent intent = new Intent(getApplicationContext(), hospital.class);
                        startActivity(intent);
                        break;}
                    case 5:
                    {Toast toast = Toast.makeText(getApplicationContext(), "Government Blocks", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.BOTTOM,0,0);toast.show();
                        Intent intent = new Intent(getApplicationContext(), government_offices.class);
                        startActivity(intent);
                        break;}
                    case 6:
                    {Toast toast = Toast.makeText(getApplicationContext(), "Restaurants and Cafes", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.BOTTOM,0,0);toast.show();
                        Intent intent = new Intent(getApplicationContext(), restaurant_and_cafe.class);
                        startActivity(intent);
                        break;}
                }
            }
        });
    }
}