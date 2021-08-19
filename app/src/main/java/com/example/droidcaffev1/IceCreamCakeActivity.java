package com.example.droidcaffev1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class IceCreamCakeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice_cream_cake);
        TextView iceCreamCakeTitle = findViewById(R.id.iceCreamCake_title);
        iceCreamCakeTitle.setText(getIntent().getStringExtra("iTitle"));
        TextView iceCreamCakeDescription = findViewById(R.id.iceCreamCake_description);
        iceCreamCakeDescription.setText(getIntent().getStringExtra("iDescription"));
        ImageView iceCreamCakeImage = findViewById(R.id.iceCreamCake_image);
        Glide.with(this).load(getIntent().getIntExtra("iImage", 0)).into(iceCreamCakeImage);
    }
}