package com.example.bebik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class HomePageActivity extends AppCompatActivity {
    ImageView imgPP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        imgPP = findViewById(R.id.imageViewPP);

    }
}