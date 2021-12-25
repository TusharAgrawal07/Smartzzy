package com.example.diucity.Hotels;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.diucity.About_Diu.About_Diu;
import com.example.diucity.Adapter.HomeAdapter.FeatureAdapter;
import com.example.diucity.Adapter.HomeAdapter.HomeCategoryAdapter;
import com.example.diucity.Adapter.HomeAdapter.Home_Places;
import com.example.diucity.Adapter.HomeAdapter.Home_category;
import com.example.diucity.Adapter.HomeAdapter.Home_feature;
import com.example.diucity.Adapter.HomeAdapter.PopularPlacesAdapter;
import com.example.diucity.ImportantAddress.restaurant_and_cafe;
import com.example.diucity.R;
import com.example.diucity.Travel.EductionFragment;
import com.example.diucity.Travel.MainActivity;
import com.example.diucity.Travel.MallsFragment;
import com.example.diucity.Travel.TouristFragment;
import com.example.diucity.ImportantAddress.important_addresses;
import com.example.diucity.Travel.placeDetail;
import com.example.diucity.TravelDetails.Travel_Details;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class user_dashboard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    static  final float END_SCALE = 0.7f;

    RecyclerView dashRecycler, popularDash, categoryRecycler;
    RecyclerView.Adapter adapter;
    ImageView menuIcon;
    LinearLayout contentView;

    //Drawer layout
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.user_dashboard);


        dashRecycler = findViewById(R.id.recycler1);
        popularDash = findViewById(R.id.recycler2);
        categoryRecycler = findViewById(R.id.recycler3);
        menuIcon = findViewById(R.id.menu_bar);


        //menu hooks
        drawerLayout = findViewById(R.id.drawer_menu);
        navigationView = findViewById(R.id.navigation_menu);

        contentView = findViewById(R.id.content);


        navigationDrawer();


        //Recycler view functions
        dashRecycler();
        popularDash();
        CategoryRecycler();
    }

    // navigation drawer function
    private void navigationDrawer() {
        //Navigation Drawer
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);

        menuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawerLayout.isDrawerVisible(GravityCompat.START))
                    drawerLayout.closeDrawer(GravityCompat.START);
                else
                    drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        animateNavigationDrawer();
    }

    private void animateNavigationDrawer() {

        drawerLayout.addDrawerListener(new DrawerLayout.SimpleDrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

                //scale the view based on current slide offset
                final float diffScaledOffset = slideOffset*(1-END_SCALE);
                final float offsetScale = 1-diffScaledOffset;
                contentView.setScaleX(offsetScale);
                contentView.setScaleY(offsetScale);

                //Translate the view,

                final float xOffset = drawerView.getWidth() * slideOffset;
                final float xOffsetDiff = contentView.getWidth() * diffScaledOffset / 2;
                final float xTranslation = xOffset-xOffsetDiff;
                contentView.setTranslationX(xTranslation);

            }
        });
    }

    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerVisible(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.nav_home:
                Intent i = new Intent(this,user_dashboard.class);
                startActivity(i);
                break;

            case R.id.nav_hotel:
                Intent i1 = new Intent(this,Hotel_main_page.class);
                startActivity(i1);
                break;

            case R.id.nav_education:
                Intent i2 = new Intent(this, MainActivity.class);
                startActivity(i2);
                break;

            case R.id.nav_address:
                Intent i5 = new Intent(this, important_addresses.class);
                startActivity(i5);
                break;

            case R.id.nav_about:
                Intent i6 = new Intent(this, About_Diu.class);
                startActivity(i6);
                break;

            case R.id.nav_transport:
                Intent i7 = new Intent(this, Travel_Details.class);
                startActivity(i7);
                break;

        }

        return true;
    }

    //Recycler view function
    private void dashRecycler() {

        dashRecycler.setHasFixedSize(true);
        dashRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<Home_feature> featureLocations = new ArrayList<>();

        featureLocations.add(new Home_feature(R.drawable.diu_fort));
        featureLocations.add(new Home_feature(R.drawable.ghoghla_beach));
        featureLocations.add(new Home_feature(R.drawable.education_hub));
        featureLocations.add(new Home_feature(R.drawable.sunset));
        featureLocations.add(new Home_feature(R.drawable.naida));

        adapter = new FeatureAdapter(featureLocations);
        dashRecycler.setAdapter(adapter);


    }

    private void popularDash() {

        popularDash.setHasFixedSize(true);
        popularDash.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<Home_Places> placesLocations = new ArrayList<>();

        placesLocations.add(new Home_Places(R.drawable.jalandhar, "Jalandhar Beach", "Diu & Daman"));
        placesLocations.add(new Home_Places(R.drawable.sunset, "Sunset point", "Diu & Daman"));
        placesLocations.add(new Home_Places(R.drawable.fort, "Diu fort", "Diu & Daman"));
        placesLocations.add(new Home_Places(R.drawable.panikotha, "Panikhota fort", "Diu & Daman"));
        placesLocations.add(new Home_Places(R.drawable.zampa_gateway, "Zampa Gateway", "Diu & Daman"));
        placesLocations.add(new Home_Places(R.drawable.ghoghla_beach, "Ghoghla Beach", "Diu & Daman"));

        adapter = new PopularPlacesAdapter(placesLocations);
        popularDash.setAdapter(adapter);
    }

    private void CategoryRecycler() {

        categoryRecycler.setHasFixedSize(true);
        categoryRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<Home_category> categoryLocations = new ArrayList<>();
        categoryLocations.add(new Home_category(R.drawable.travelcard, "Travel"));
        adapter = new HomeCategoryAdapter(categoryLocations, this);
        categoryRecycler.setAdapter(adapter);
    }

    public void click_hotel(View view) {
        Intent hotel_btn= new Intent(this, Hotel_main_page.class);
        startActivity(hotel_btn);
    }

    public void click_edu(View view) {
        Intent edu_btn = new Intent(this,Travel_Details.class);
        startActivity(edu_btn);
    }

    public void click_tour(View view) {
        Intent tour_btn = new Intent(this, MainActivity.class);
        startActivity(tour_btn);
    }

    public void click_add(View view) {
        Intent add_btn = new Intent(this,important_addresses.class);
        startActivity(add_btn);
    }

    public void click_pop(View view) {
        Intent Pop_place = new Intent(this, restaurant_and_cafe.class);
        startActivity(Pop_place);
    }

    public void click_exp(View view) {
        Intent exp = new Intent(this,MainActivity.class);
        startActivity(exp);
    }
}