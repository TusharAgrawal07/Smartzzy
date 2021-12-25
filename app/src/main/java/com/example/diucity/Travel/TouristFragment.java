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

public class TouristFragment extends Fragment {
    public TouristFragment() {
    }


    @Override
    public void onStop() {
        super.onStop();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_listview, container, false);
        final ArrayList<Item> inner_Details = new ArrayList<>();

        inner_Details.add(new Item(getString(R.string.Fort_title),R.drawable.fort_diu,getString(R.string.Fort_location)));

        inner_Details.add(new Item(getString(R.string.Albert_hall_title),R.drawable.fort_museum,getString(R.string.Albert_hall_location)));

        inner_Details.add(new Item(getString(R.string.Naida_title),R.drawable.fort_naidacaves,getString(R.string.Naida_location)));

        inner_Details.add(new Item(getString(R.string.Jampore_title),R.drawable.fort_jamporebeach, getString(R.string.Jampore_location)));

        inner_Details.add(new Item(getString(R.string.Nagoa_title),R.drawable.fort_nagoabeach,getString(R.string.Nagoa_location)));

        inner_Details.add(new Item(getString(R.string.Church_title),R.drawable.fort_saintpaulchurch,getString(R.string.Church_location)));

        final ItemAdapter adapter = new ItemAdapter(getActivity(), inner_Details);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Item Current_list = inner_Details.get(i);

                Intent itemDetailIntent = new Intent(getContext(), placeDetail.class);

                itemDetailIntent.putExtra(getString(R.string.intent_extra_item_title),
                        Current_list.getTitle());

                startActivity(itemDetailIntent);
            }
        });
        return rootView;
    }
}