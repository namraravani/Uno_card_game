package com.example.unocardgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button5);

        button1.setOnClickListener(v -> {

            Intent send = new Intent(MainActivity.this,Frame_1.class);
            startActivity(send);
            finish();

        });



    }
}