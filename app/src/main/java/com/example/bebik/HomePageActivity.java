package com.example.bebik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomePageActivity extends AppCompatActivity {
    ImageView imgPP;
    Button btnListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        imgPP = findViewById(R.id.imageViewPP);
        btnListView = findViewById(R.id.buttonListView);

        btnListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this,ListViewActivity.class);
                startActivity(intent);

            }
        });

    }
}