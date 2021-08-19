package com.example.droidcaffev1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class SpringRollActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spring_roll);
        TextView springRollTitle = findViewById(R.id.springRoll_title);
        springRollTitle.setText(getIntent().getStringExtra("springTitle"));
        TextView springRollDescription = findViewById(R.id.springRoll_description);
        springRollDescription.setText(getIntent().getStringExtra("springDescription"));
        ImageView springRollImage = findViewById(R.id.springRoll_image);
        Glide.with(this).load(getIntent().getIntExtra("springImage", 0)).into(springRollImage);
    }
}