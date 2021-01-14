package com.company.foodapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CartActivity extends AppCompatActivity {

    TextView textView ,textView1;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);


        textView=findViewById(R.id.txt);
        textView1=findViewById(R.id.txt1);
        imageView=findViewById(R.id.img);


        String title=getIntent().getStringExtra("title");
        String price=getIntent().getStringExtra("price");
        int imageId=getIntent().getIntExtra("image",0);


        textView.setText(title);
        textView1.setText(price);
        imageView.setImageResource(imageId);


    }
}
