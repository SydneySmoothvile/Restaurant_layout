package com.example.droidcaffev1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class SwissRollActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiss_roll);
        TextView swissRollTitle = findViewById(R.id.swissRoll_title);
        swissRollTitle.setText(getIntent().getStringExtra("swTitle"));
        TextView swissRollDescription = findViewById(R.id.swissRoll_description);
        swissRollDescription.setText(getIntent().getStringExtra("swDescription"));
        ImageView swissRollImage = findViewById(R.id.swissRoll_image);
        Glide.with(this).load(getIntent().getIntExtra("swImage", 0)).into(swissRollImage);
    }
}