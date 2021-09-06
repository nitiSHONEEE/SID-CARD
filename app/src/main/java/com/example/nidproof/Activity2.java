package com.example.nidproof;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
          TextView tvRes ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tvRes = findViewById(R.id.tvRes);
        String text = getIntent().getStringExtra("data");

        tvRes.setText(text);


    }
}