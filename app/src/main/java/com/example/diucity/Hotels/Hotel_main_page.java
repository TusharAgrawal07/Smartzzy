package com.example.diucity.Hotels;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.diucity.Adapter.RecommendedHotelAdapter;
import com.example.diucity.Adapter.PopularHotelAdapter;
import com.example.diucity.R;
import com.example.diucity.model.Recommended;
import com.example.diucity.model.PopularHotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel_main_page extends AppCompatActivity {

    RecyclerView popularRecycler, asiaRecycler;
    PopularHotelAdapter popularHotelAdapter;
    RecommendedHotelAdapter recommendedHotelAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotel_main_page);

        // now here we will add some dummy data to out model class

        ArrayList<PopularHotel> popularHotelList = new ArrayList<>();

        popularHotelList.add(new PopularHotel("Float Restaurant", "Near Nagoa Beach", R.drawable.hotel1,"1999 Rs."));
        popularHotelList.add(new PopularHotel("Diu Starbelly", "Near Diu Fort", R.drawable.hotel2,"1199 Rs."));
        popularHotelList.add(new PopularHotel("Spring Brook", "Near Zampa Gateway", R.drawable.hotel3,"1499 Rs."));
        popularHotelList.add(new PopularHotel("The Lakefront", "Near Education hub", R.drawable.hotel4,"1599 Rs."));
        popularHotelList.add(new PopularHotel("Spectra Resort", "Near AirPort", R.drawable.hotel5,"1299 Rs."));

        setPopularRecycler(popularHotelList);


        ArrayList<Recommended> recommendedList = new ArrayList<>();
        recommendedList.add(new Recommended("Zampa Gateway", "$20", R.drawable.res1, "4.5", "Spring Restaurant"));
        recommendedList.add(new Recommended("Air port", "$25", R.drawable.res2, "3.9", "Friends Restaurant"));
        recommendedList.add(new Recommended("Diu fort", "$20", R.drawable.res3, "4.5", "City Restaurant"));
        recommendedList.add(new Recommended("Diu fort", "$25", R.drawable.res1, "4.8", "Nights Restaurant"));
        recommendedList.add(new Recommended("Ghoghla beach", "$20", R.drawable.res3, "4.5", "Briand Restaurant"));
        setAsiaRecycler(recommendedList);

    }


    private void setPopularRecycler(List<PopularHotel> popularHotelList) {

        popularRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler.setLayoutManager(layoutManager);
        popularHotelAdapter = new PopularHotelAdapter(this, popularHotelList);
        popularRecycler.setAdapter(popularHotelAdapter);

    }

    private void setAsiaRecycler(List<Recommended> recommendedList) {

        asiaRecycler = findViewById(R.id.asia_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        asiaRecycler.setLayoutManager(layoutManager);
        recommendedHotelAdapter = new RecommendedHotelAdapter(this, recommendedList);
        asiaRecycler.setAdapter(recommendedHotelAdapter);

    }

}
