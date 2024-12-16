package com.example.pr2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView titleTextView = findViewById(R.id.detail_title);
        TextView descriptionTextView = findViewById(R.id.detail_description);
        ImageView imageView = findViewById(R.id.detail_image);

        String title = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");
        int imageResource = getIntent().getIntExtra("imageResource", 0);

        titleTextView.setText(title);
        descriptionTextView.setText(description);
        imageView.setImageResource(imageResource);

    }
}