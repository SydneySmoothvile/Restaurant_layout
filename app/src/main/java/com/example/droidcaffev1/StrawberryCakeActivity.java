package com.example.droidcaffev1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class StrawberryCakeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strawberry_cake);
        TextView strawberryCakeTitle = findViewById(R.id.strawberryCake_title);
        strawberryCakeTitle.setText(getIntent().getStringExtra("sTitle"));
        TextView strawberryCakeDescription = findViewById(R.id.strawberryCake_description);
        strawberryCakeDescription.setText(getIntent().getStringExtra("sDescription"));
        ImageView strawberryCakeImage = findViewById(R.id.strawberryCake_image);
        Glide.with(this).load(getIntent().getIntExtra("sImage", 0)).into(strawberryCakeImage);
    }
}