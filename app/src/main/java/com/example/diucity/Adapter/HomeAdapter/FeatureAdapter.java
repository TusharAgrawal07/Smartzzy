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

public class FeatureAdapter extends RecyclerView.Adapter<FeatureAdapter.FeatureViewHolder> {

    ArrayList<Home_feature> HomeFeature;

    public FeatureAdapter(ArrayList<Home_feature> homeFeature) {
        this.HomeFeature = homeFeature;
    }

    @NonNull
    @Override
    public FeatureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dash_cardboard, parent,false);
        FeatureViewHolder featureViewHolder = new FeatureViewHolder(view);
        return featureViewHolder ;
    }

    @Override
    public void onBindViewHolder(@NonNull FeatureViewHolder holder, int position) {

        Home_feature featureClass = HomeFeature.get(position);
        holder.image.setImageResource(featureClass.getImage());
    }

    @Override
    public int getItemCount() {
        return HomeFeature.size();
    }


    public static class FeatureViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
//        TextView title, description;

        public FeatureViewHolder(@NonNull View itemView) {
            super(itemView);

            //design hooks

            image = itemView.findViewById(R.id.dash1);
//            title = itemView.findViewById(R.id.dash_title);
//            description = itemView.findViewById(R.id.dash_disc);
        }
    }



}
