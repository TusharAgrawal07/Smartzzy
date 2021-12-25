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

public class MallsFragment extends Fragment {
    public MallsFragment() {
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.item_listview, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(getString(R.string.First_title),
                R.drawable.mall_first,
                getString(R.string.First_location)));

        items.add(new Item(getString(R.string.SECOND_title),
                R.drawable.mall_sec,
                getString(R.string.SECOND_location)));

        items.add(new Item(getString(R.string.THIRD_title),
                R.drawable.mall_third,
                getString(R.string.THIRD_location)));

        items.add(new Item(getString(R.string.FOURTH_title),
                R.drawable.mall_fourth,
                getString(R.string.FOURTH_location)));

        items.add(new Item(getString(R.string.FIFTH_title),
                R.drawable.mall_fifth,
                getString(R.string.FIFTH_location)));


        items.add(new Item(getString(R.string.Park_title),
                R.drawable.mall_park,
                getString(R.string.Park_location)));

        final ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Item currentItem = items.get(i);

                Intent itemDetailIntent = new Intent(getContext(), placeDetail.class);

                itemDetailIntent.putExtra(getString(R.string.intent_extra_item_title), currentItem.getTitle());

                startActivity(itemDetailIntent);
            }
        });

        return rootView;
    }

}