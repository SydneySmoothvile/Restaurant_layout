package com.example.droidcaffev1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ChocolateCakeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chocolate_cake);
        TextView chocolateCakeTitle = findViewById(R.id.chocolateCake_title);
        chocolateCakeTitle.setText(getIntent().getStringExtra("chTitle"));
        TextView chocolateCakeDescription = findViewById(R.id.chocolateCake_description);
        chocolateCakeDescription.setText(getIntent().getStringExtra("chDescription"));
        ImageView chocolateCakeImage = findViewById(R.id.chocolateCake_image);
        Glide.with(this).load(getIntent().getIntExtra("chImage", 0)).into(chocolateCakeImage);
    }
}