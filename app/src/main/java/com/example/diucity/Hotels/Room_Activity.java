package com.example.diucity.Hotels;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.diucity.Adapter.RoomAdapter;
import com.example.diucity.R;
import com.example.diucity.model.Room_details;

import java.util.ArrayList;

public class Room_Activity extends AppCompatActivity {


    GridView roomview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        roomview = findViewById(R.id.roomsId);
        ArrayList<Room_details> room_list = new ArrayList<>();

        room_list.add(new Room_details("Classic | single", "Non Ac", "1199 Rs.", R.drawable.hotel1));
        room_list.add(new Room_details("Classic | Double", "With Ac", "1599 Rs.", R.drawable.hotel1));
        room_list.add(new Room_details("Deluxe | Single", "With Balcony", "1199 Rs.", R.drawable.hotel1));
        room_list.add(new Room_details("Deluxe | Double", "Non Balcony", "1199 Rs.", R.drawable.hotel1));
        room_list.add(new Room_details("Single Bed | Basic", "Non Ac", "1199 Rs.", R.drawable.hotel1));
        room_list.add(new Room_details("Single Bed | classic", "With Ac", "1199 Rs.", R.drawable.hotel1));
        room_list.add(new Room_details("Double Bed | Basic", "Non Ac", "1199 Rs.", R.drawable.hotel1));
        room_list.add(new Room_details("Single Bed | classic", "Non Ac", "1199 Rs.", R.drawable.hotel1));
        room_list.add(new Room_details("Classic (2x)", "Non Ac", "1199 Rs.", R.drawable.hotel1));


        RoomAdapter adapter = new RoomAdapter(this,room_list);
        roomview.setAdapter(adapter);

    }
}