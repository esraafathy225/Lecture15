package com.company.foodapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


public class FoodAdapter extends ArrayAdapter<Food> {

    public FoodAdapter(@NonNull Context context, @NonNull ArrayList<Food> food) {
        super(context, 0,food);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.custom_grid,parent,false);
        TextView title=convertView.findViewById(R.id.txt);
        TextView price=convertView.findViewById(R.id.txt1);
        ImageView imageView=convertView.findViewById(R.id.img);

        Food food=getItem(position);
        title.setText(food.getTitle());
        price.setText(food.getPrice());
        imageView.setImageResource(food.getImageId());

        return convertView;
    }


}
