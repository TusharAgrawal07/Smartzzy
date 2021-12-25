package com.example.diucity.Adapter.HomeAdapter;

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
import com.example.diucity.TravelDetails.Travel_Details;

import java.util.ArrayList;

public class HomeCategoryAdapter extends RecyclerView.Adapter<HomeCategoryAdapter.CategoryViewHolder>{

ArrayList<Home_category> Category;
Context context;


    public HomeCategoryAdapter(ArrayList<Home_category> Category, Context context) {
        this.Category = Category;
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.explore_cardview, parent,false);
        CategoryViewHolder categoryViewHolder = new CategoryViewHolder(view);
        return categoryViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {

        Home_category categoryClass = Category.get(position);
        holder.image.setImageResource(categoryClass.getImage());
        holder.title.setText(categoryClass.getTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, Travel_Details.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return Category.size();
    }


    public static class CategoryViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView title;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            //design hooks

            image = (ImageView) itemView.findViewById(R.id.Hospital_c);
            title = itemView.findViewById(R.id.title_c1);

        }
    }

}
