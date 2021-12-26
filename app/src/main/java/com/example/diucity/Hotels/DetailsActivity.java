package com.example.diucity.Hotels;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.diucity.R;

public class DetailsActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView, prizeView, placeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);

        imageView = findViewById(R.id.hotel1img);
        textView =  findViewById(R.id.titlename);
        placeView = findViewById(R.id.nearBy);
        prizeView = findViewById(R.id.textView14);

        textView.setText(getIntent().getStringExtra("name_hotel"));
        placeView.setText(getIntent().getStringExtra("hotel_place"));
        prizeView.setText(getIntent().getStringExtra("prize_hotel"));
        imageView.setImageResource(getIntent().getExtras().getInt("hotelname",0));
    }

    public void room_btn(View view) {
        Intent room_i = new Intent(this,Room_Activity.class);
        startActivity(room_i);
    }
}