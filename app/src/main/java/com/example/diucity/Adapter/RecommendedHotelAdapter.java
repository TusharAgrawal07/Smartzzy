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

import com.example.diucity.Hotels.Recommended_details;
import com.example.diucity.R;
import com.example.diucity.model.Recommended;

import java.util.List;

public class RecommendedHotelAdapter extends RecyclerView.Adapter<RecommendedHotelAdapter.RecHotelViewHolder> {

    Context context;
    List<Recommended> recommendedList;

    public RecommendedHotelAdapter(Context context, List<Recommended> recommendedList) {
        this.context = context;
        this.recommendedList = recommendedList;
    }

    @NonNull
    @Override
    public RecHotelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.recommende_row_item, parent, false);
        return new RecHotelViewHolder(view);
    }

    @Override
    public void onBindViewHolder( RecHotelViewHolder holder, int position) {

        Recommended temp = recommendedList.get(position);

        holder.name.setText(recommendedList.get(position).getName());
        holder.price.setText(recommendedList.get(position).getPrice());
        holder.foodImage.setImageResource(recommendedList.get(position).getImageUrl());
        holder.rating.setText(recommendedList.get(position).getRating());
        holder.restorantName.setText(recommendedList.get(position).getRestaurantName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, Recommended_details.class);
                i.putExtra("name_hotel", temp.getRestaurantName());
                i.putExtra("prize_hotel", temp.getPrice());
                i.putExtra("hotelname", temp.getImageUrl());
                i.putExtra("rating_hotel",temp.getRating());
                i.putExtra("place_hotel",temp.getName());
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);
            }
        });


    }

    @Override
    public int getItemCount() {
        return recommendedList.size();
    }


    public static final class RecHotelViewHolder extends RecyclerView.ViewHolder{


        ImageView foodImage;
        TextView price, name, rating, restorantName;

        public RecHotelViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.place_name);
            foodImage = itemView.findViewById(R.id.h_image);
            price = itemView.findViewById(R.id.price);
            rating = itemView.findViewById(R.id.rating);
            restorantName = itemView.findViewById(R.id.restorant_name);

        }
    }

}
