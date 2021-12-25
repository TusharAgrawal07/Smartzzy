package com.example.diucity.Travel;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;

import androidx.appcompat.app.AppCompatActivity;

import com.example.diucity.R;

import java.util.ArrayList;
import java.util.Objects;

public class placeDetail extends AppCompatActivity {
    final ArrayList<Item> mItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);



        String itemTitle = getIntent().getStringExtra(getString(R.string.intent_extra_item_title));

        setTitle(itemTitle);

        initItems(mItems);

        int currentPlaceIndex = getItemIndexByTitle(itemTitle);

        inflateLayout(currentPlaceIndex);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return false;
    }

    private void inflateLayout(int index) {
        ImageView placeImage = findViewById(R.id.item_image);
        placeImage.setImageResource(mItems.get(index).getImageResourceId());

        TextView placeName = findViewById(R.id.item_title);
        placeName.setText(mItems.get(index).getTitle());

        TextView placeLocation = findViewById(R.id.item_location);
        placeLocation.setText(mItems.get(index).getLocation());

        TextView PlaceHighlight = findViewById(R.id.item_hightlights);

        String[] highlights = mItems.get(index).getHighlights();

        String highlights_text = "";

        for (String highlight : highlights) {
            highlights_text += "* " + highlight + "\n\n";
        }
        PlaceHighlight.setText(highlights_text);

    }


    private int getItemIndexByTitle(String title) {
        try {
            for (int i = 0; i < mItems.size(); i++) {
                Item currentItem = mItems.get(i);
                String currentTitle = currentItem.getTitle();
                if (title.equals(currentTitle)) {
                    return i;
                }
            }
        }
        catch (Error error) {
            error.printStackTrace();
        }
        return -1;
    }

    private void initItems(ArrayList<Item> place) {

        place.add(new Item(getString(R.string.First_title),
                R.drawable.mall_first,
                getString(R.string.First_location),
                getResources().getStringArray(R.array.First_highlights)));

        place.add(new Item(getString(R.string.SECOND_title),
                R.drawable.mall_sec,
                getString(R.string.SECOND_location),
                getResources().getStringArray(R.array.SECOND_highlights)));

        place.add(new Item(getString(R.string.THIRD_title),
                R.drawable.mall_third,
                getString(R.string.THIRD_location),
                getResources().getStringArray(R.array.THIRD_highlights)));

        place.add(new Item(getString(R.string.FOURTH_title),
                R.drawable.mall_fourth,
                getString(R.string.FOURTH_location),
                getResources().getStringArray(R.array.FOURTH_highlights)));

        place.add(new Item(getString(R.string.FIFTH_title),
                R.drawable.mall_fifth,
                getString(R.string.FIFTH_location),
                getResources().getStringArray(R.array.FIFTH_highlights)));

        place.add(new Item(getString(R.string.Park_title),
                R.drawable.mall_park,
                getString(R.string.Park_location),
                getResources().getStringArray(R.array.Park_highlights)));

        place.add(new Item(getString(R.string.IIITVICD_title),
                R.drawable.edu_iiitvicd,
                getString(R.string.IIITVICD_location),
                getResources().getStringArray(R.array.IIITVICD_highlights)));

        place.add(new Item(getString(R.string.DIUCLG_title),
                R.drawable.edu_diuclg,
                getString(R.string.DIUCLG_location),
                getResources().getStringArray(R.array.DIUCLG_highlights)));

        place.add(new Item(getString(R.string.VEDIK_title),
                R.drawable.edu_vedik,
                getString(R.string.VEDIK_location),
                getResources().getStringArray(R.array.VEDIK_highlights)));

        place.add(new Item(getString(R.string.GALAXY_title),
                R.drawable.edu_galaxy,
                getString(R.string.GALAXY_location),
                getResources().getStringArray(R.array.GALAXY_highlights)));

        place.add(new Item(getString(R.string.JAWAHAR_title),
                R.drawable.edu_jawahar,
                getString(R.string.JAWAHAR_location),
                getResources().getStringArray(R.array.JAWAHAR_highlights)));

        place.add(new Item(getString(R.string.KV_title),
                R.drawable.edu_kv,
                getString(R.string.KV_location),
                getResources().getStringArray(R.array.KV_highlights)));


        place.add(new Item(getString(R.string.Fort_title),
                R.drawable.fort_diu,
                getString(R.string.Fort_location),
                getResources().getStringArray(R.array.Fort_highlights)));

        place.add(new Item(getString(R.string.Albert_hall_title),
                R.drawable.fort_museum,
                getString(R.string.Albert_hall_location),
                getResources().getStringArray(R.array.Albert_hall_highlights)));

        place.add(new Item(getString(R.string.Naida_title),
                R.drawable.fort_naidacaves,
                getString(R.string.Naida_location),
                getResources().getStringArray(R.array.Naida_highlights)));

        place.add(new Item(getString(R.string.Jampore_title),
                R.drawable.fort_jamporebeach,
                getString(R.string.Jampore_location),
                getResources().getStringArray(R.array.Jampore_highlights)));

        place.add(new Item(getString(R.string.Nagoa_title),
                R.drawable.fort_nagoabeach,
                getString(R.string.Nagoa_location),
                getResources().getStringArray(R.array.Nagoa_highlights)));

        place.add(new Item(getString(R.string.Church_title),
                R.drawable.fort_saintpaulchurch,
                getString(R.string.Church_location),
                getResources().getStringArray(R.array.Church_highlights)));
    }
}
