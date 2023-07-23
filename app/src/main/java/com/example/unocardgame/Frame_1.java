package com.example.unocardgame;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Frame_1 extends AppCompatActivity {



    ImageButton mainbutton1,mainbutton2,mainbutton3;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame1);

        mainbutton1 = findViewById(R.id.imageButton4);
        mainbutton2 = findViewById(R.id.imageButton5);
        mainbutton3 = findViewById(R.id.imageButton6);
        text = findViewById(R.id.textView);
        text.setTextColor(Color.parseColor("#FFFFFF"));
        text.setTextSize(20);


        mainbutton1.setOnClickListener(v -> {

            Intent send = new Intent(Frame_1.this,Frame_2.class);
            startActivity(send);
            finish();

        });

        mainbutton2.setOnClickListener(v -> {

            Intent send = new Intent(Frame_1.this,Frame_3.class);
            startActivity(send);
            finish();

        });

        mainbutton3.setOnClickListener(v -> {

            Intent send = new Intent(Frame_1.this,Frame_4.class);
            startActivity(send);
            finish();

        });
    }


}
