package com.company.foodapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   ArrayList<Food> food;
   GridView gridView;
    FoodAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        food=new ArrayList<>();
        food.add(new Food("Cheese Burger","3.5$",R.drawable.burger));
        food.add(new Food("Chicken Shawerma","4.5$",R.drawable.shawerma));
        food.add(new Food("Pancakes","2.99$",R.drawable.pancakes));
        food.add(new Food("Pepperoni Pizza","3.99$",R.drawable.pizza));
        food.add(new Food("Fillet Steak","10.5$",R.drawable.filletsteak));
        food.add(new Food("Chocolate Waffles","2.5$",R.drawable.waffles));


        gridView=findViewById(R.id.grid);
        adapter=new FoodAdapter(this,food);
        gridView.setAdapter(adapter);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

               Food foodObj = (Food) gridView.getAdapter().getItem(i);

               Intent intent =new Intent(MainActivity.this,CartActivity.class);

               intent.putExtra("title",foodObj.getTitle());
               intent.putExtra("price",foodObj.getPrice());
               intent.putExtra("image",foodObj.getImageId());

               startActivity(intent);
            }
        });

    }
}
