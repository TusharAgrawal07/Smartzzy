package com.example.diucity.Adapter.HomeAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.diucity.R;

import java.util.ArrayList;

public class PopularPlacesAdapter extends RecyclerView.Adapter<PopularPlacesAdapter.PopularViewHolder> {

    ArrayList<Home_Places> HomePlaces;

    public PopularPlacesAdapter(ArrayList<Home_Places> HomePlaces){
        this.HomePlaces = HomePlaces;
    }

    @NonNull
    @Override
    public PopularViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.popular_places_cardview, parent,false);
        return new PopularViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularViewHolder holder, int position) {

        Home_Places popularClass = HomePlaces.get(position);
        holder.image.setImageResource(popularClass.getImage());
        holder.title.setText(popularClass.getTitle());
        holder.description.setText(popularClass.getDescription());
    }


    @Override
    public int getItemCount() {
        return HomePlaces.size();
    }


    public static class PopularViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView title, description;

        public PopularViewHolder(@NonNull View itemView) {
            super(itemView);

            //design hooks

            image = itemView.findViewById(R.id.place1);
            title = itemView.findViewById(R.id.place1_title);
            description = itemView.findViewById(R.id.place1_desc);
        }
    }



}
