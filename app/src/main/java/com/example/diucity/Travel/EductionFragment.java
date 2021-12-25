package com.example.diucity.Travel;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.diucity.Adapter.ItemAdapter;
import com.example.diucity.R;

import java.util.ArrayList;

//Create LodgeFragment
public class EductionFragment extends Fragment {
    //Create LodgeFragment constructor
    public EductionFragment() {
        //empty constructor
    }

    //Override onStart method
    @Override
    public void onStart() {
        super.onStart();
    }

    //Override onCreateView method
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //First, create a rootView and inflate layout from item_listview
        View rootView = inflater.inflate(R.layout.item_listview, container, false);

        //Create a ArrayList of Item
        final ArrayList<Item> items = new ArrayList<Item>();

        //Add list data
        items.add(new Item(getString(R.string.IIITVICD_title),
                R.drawable.edu_iiitvicd,
                getString(R.string.IIITVICD_location)));

        items.add(new Item(getString(R.string.VEDIK_title),
                R.drawable.edu_vedik,
                getString(R.string.VEDIK_location)));

        items.add(new Item(getString(R.string.DIUCLG_title),
                R.drawable.edu_diuclg,
                getString(R.string.DIUCLG_location)));

        items.add(new Item(getString(R.string.GALAXY_title),
                R.drawable.edu_galaxy,
                getString(R.string.GALAXY_location)));

        items.add(new Item(getString(R.string.JAWAHAR_title),
                R.drawable.edu_jawahar,
                getString(R.string.JAWAHAR_location)));

        items.add(new Item(getString(R.string.KV_title),
                R.drawable.edu_kv,
                getString(R.string.KV_location)));


        //Create an ItemAdapter
        final ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        //Get list view
        ListView listView = rootView.findViewById(R.id.list);

        //Bind with adapter
        listView.setAdapter(adapter);

        //Create a onClickLIstener when listview item clicked
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Get current item index
                Item currentItem = items.get(i);

                //Create an Intent
                Intent itemDetailIntent = new Intent(getContext(), placeDetail.class);

                //Add an extra var; ITEM_TITEL so we can reference in the placeDetail activity
                itemDetailIntent.putExtra(getString(R.string.intent_extra_item_title), currentItem.getTitle());

                //Start the intent
                startActivity(itemDetailIntent);
            }
        });

        //Return the view
        return rootView;
    }
}