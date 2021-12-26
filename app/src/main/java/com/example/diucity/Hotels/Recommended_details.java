package com.example.diucity.Hotels;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.diucity.R;

public class Recommended_details extends AppCompatActivity {

    ImageView imageView;
    TextView nameView, prizeView, placeView, ratingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recommended_details);

        nameView = findViewById(R.id.Restaurant_name);
        //prizeView = findViewById(R.id.Visit_now);
        imageView = findViewById(R.id.Restaurant_image);
        placeView  =findViewById(R.id.Restaurant_place);
        //ratingView = findViewById(R.id.rating);

        nameView.setText(getIntent().getStringExtra("name_hotel"));
        //prizeView.setText(getIntent().getStringExtra("prize_hotel"));
        imageView.setImageResource(getIntent().getExtras().getInt("hotelname",0));
        //ratingView.setText(getIntent().getStringExtra("rating_hotel"));
        placeView.setText(getIntent().getStringExtra("place_hotel"));

    }

    public void click_visit(View view) {
        Intent i = new Intent(this,Room_Activity.class);
        startActivity(i);
    }
}