package com.example.droidcaffev1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class SpongeCakeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponge_cake);
        TextView spongeCakeTitle = findViewById(R.id.spongeCake_title);
        spongeCakeTitle.setText(getIntent().getStringExtra("spTitle"));
        TextView spongeCakeDescription = findViewById(R.id.spongeCake_description);
        spongeCakeDescription.setText(getIntent().getStringExtra("spDescription"));
        ImageView spongeCakeImage = findViewById(R.id.spongeCake_image);
        Glide.with(this).load(getIntent().getIntExtra("spImage", 0)).into(spongeCakeImage);
    }
}