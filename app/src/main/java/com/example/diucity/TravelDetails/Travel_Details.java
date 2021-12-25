package com.example.diucity.TravelDetails;

import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.ActionBar;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.diucity.R;

public class Travel_Details extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.travel_details);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null)
        {
            String title = "Travel Details";
            actionBar.setTitle(title);
        }

        ListView listView = (ListView) findViewById(R.id.travel_list);
        final String[] text = {"Taxi Service","Tour & Travels","Cruise","Flights","Buses & Trains"};

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
                    {Toast toast = Toast.makeText(getApplicationContext(), "Taxi Service", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.BOTTOM,0,0);toast.show();
                        Intent intent = new Intent(getApplicationContext(), taxi_service.class);
                        startActivity((intent));
                        break;}
                    case 1:
                    {Toast toast = Toast.makeText(getApplicationContext(), "Tour & Travels", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.BOTTOM,0,0);toast.show();
                        Intent intent = new Intent(getApplicationContext(), tour_and_travels.class);
                        startActivity((intent));
                        break;}
                    case 2:
                    {Toast toast = Toast.makeText(getApplicationContext(), "Cruise", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.BOTTOM,0,0);toast.show();
                        Intent intent = new Intent(getApplicationContext(), cruise.class);
                        startActivity((intent));
                        break;}
                    case 3:
                    {Toast toast = Toast.makeText(getApplicationContext(), "Flights", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.BOTTOM,0,0);toast.show();
                        Intent intent = new Intent(getApplicationContext(), flights.class);
                        startActivity((intent));
                        break;}
                    case 4:
                    {Toast toast = Toast.makeText(getApplicationContext(), "Buses & Trains", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.BOTTOM,0,0);toast.show();
                        Intent intent = new Intent(getApplicationContext(), buses_and_trains.class);
                        startActivity((intent));
                        break;}
                }
            }
        });
    }
}