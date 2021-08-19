package com.example.droidcaffev1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class CoffeeCakeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_cake);
        TextView coffeeCakeTitle = findViewById(R.id.coffeeCake_title);
        coffeeCakeTitle.setText(getIntent().getStringExtra("cTitle"));
        TextView coffeeCakeDescription = findViewById(R.id.coffeeCake_description);
        coffeeCakeDescription.setText(getIntent().getStringExtra("cDescription"));
        ImageView coffeeCakeImage = findViewById(R.id.coffeeCake_image);
        Glide.with(this).load(getIntent().getIntExtra("cImage", 0)).into(coffeeCakeImage);
    }
}