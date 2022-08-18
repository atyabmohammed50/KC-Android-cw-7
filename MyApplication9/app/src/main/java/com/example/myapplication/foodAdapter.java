package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class foodAdapter extends ArrayAdapter {
    List<Food> foodlist;
    public foodAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        foodlist = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.item_row,parent, false);

        Food currentFood = foodlist.get(position);

        TextView foodnametext = view.findViewById(R.id.itemName);
        TextView foodpricetext = view.findViewById(R.id.itemPrice);
        ImageView foodimageview = view.findViewById(R.id.itemImage);

        foodnametext.setText(currentFood.getFoodname());
        foodpricetext.setText(String.valueOf(currentFood.getFoodprice()));
        foodimageview.setImageResource(currentFood.getFoodImage());

          return view;
    }
}
