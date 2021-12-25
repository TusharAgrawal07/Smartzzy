package com.example.diucity.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.diucity.Hotels.DetailsActivity;
import com.example.diucity.R;
import com.example.diucity.model.PopularHotel;


import java.util.List;


public class PopularHotelAdapter extends RecyclerView.Adapter<PopularHotelAdapter.PopularFoodViewHolder> {

    Context context;
    List<PopularHotel> popularHotelList;

    public PopularHotelAdapter(Context context, List<PopularHotel> popularHotelList) {
        this.context = context;
        this.popularHotelList = popularHotelList;
    }

    @NonNull
    @Override
    public PopularFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.popular_hotel_row_item, parent, false);
        return new PopularFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularFoodViewHolder holder, int position) {

        PopularHotel temp = popularHotelList.get(position);

        holder.foodImage.setImageResource(popularHotelList.get(position).getImageUrl());
        holder.name.setText(popularHotelList.get(position).getName());
        holder.price.setText(popularHotelList.get(position).getPrice());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, DetailsActivity.class);
                i.putExtra("name_hotel", temp.getName());
                i.putExtra("hotel_place", temp.getPlace());
                i.putExtra("prize_hotel", temp.getPrice());
                i.putExtra("hotelname", temp.getImageUrl());
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return popularHotelList.size();
    }

    public static final class PopularFoodViewHolder extends RecyclerView.ViewHolder {


        ImageView foodImage;
        TextView price, name;

        public PopularFoodViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.hotel_image);
            price = itemView.findViewById(R.id.near);
            name = itemView.findViewById(R.id.name);


        }
    }

}