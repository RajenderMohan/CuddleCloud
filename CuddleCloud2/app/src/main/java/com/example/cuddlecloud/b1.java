package com.example.cuddlecloud;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class b1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_b1);
        ImageView img1 = findViewById(R.id.img1);
        if (img1 != null) {
            img1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(b1.this, b3.class);
                    startActivity(i);
                }
            });
        }

        ImageView img1 = findViewById(R.id.imageView1); // Gets the specific ImageView from your layou
        if (img1 != null) {
            img1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, b1.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }

    }
}