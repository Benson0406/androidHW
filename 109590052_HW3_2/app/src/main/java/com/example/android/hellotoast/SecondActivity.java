package com.example.android.hellotoast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView count = findViewById(R.id.show_count2);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.LOG_TAG);
        count.setText(message);
    }
}