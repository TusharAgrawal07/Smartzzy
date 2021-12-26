package com.example.diucity.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.diucity.R;
import com.example.diucity.model.Room_details;

import java.util.ArrayList;

public class RoomAdapter extends ArrayAdapter<Room_details> {

    public RoomAdapter(@NonNull Context context, ArrayList<Room_details>  room_list) {
        super(context, 0,  room_list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemView = convertView;
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.card_view, parent, false);
        }
        Room_details roomModel = getItem(position);
        TextView roomName = listitemView.findViewById(R.id.room_name);
        TextView roomType = listitemView.findViewById(R.id.roomType);
        ImageView roomImage = listitemView.findViewById(R.id.room_image);
        roomName.setText(roomModel.getRoomName());
        roomType.setText(roomModel.getRoomType());
        roomImage.setImageResource(roomModel.getImageUrl());
        return listitemView;
    }
}
