package com.example.unocardgame;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Frame_2 extends AppCompatActivity {

    int oldValue;
    Button back;
    TextView text1;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame2);
        text1 = findViewById(R.id.textView3);
        text1.setTextSize(20);
        text1.setTextColor(Color.parseColor("#000000"));
        changeTextViewValueRandomlyOnButtonClick();

    }



    private void changeTextViewValueRandomlyOnButtonClick() {
        final String[] str = {"Answer is :  76/108 = 0.7", "Answer is : 19/108 = 0.17","Answer is : 8/108 = 0.07","Answer is : 2/108 = 0.018","Answer is : 1/108 = 0.00925"};
        final TextView changingText = (TextView) findViewById(R.id.textView4);
        changingText.setTextSize(40);
        changingText.setTextColor(Color.parseColor("#000000"));
        final TextView text = (TextView) findViewById(R.id.textView3);
        text.setTextColor(Color.parseColor("#000000"));
        Button back = (Button) findViewById((R.id.n_button7));
        Button button1 = (Button) findViewById(R.id.n_button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingText.setText(str[0]);
                changingText.setTextSize(40);


            }
        });

        Button button2 = (Button) findViewById(R.id.n_button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingText.setText(str[1]);

            }
        });

        Button button3 = (Button) findViewById(R.id.n_button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingText.setText(str[1]);

            }
        });

        Button button4 = (Button) findViewById(R.id.n_button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingText.setText(str[1]);

            }
        });

        Button button5 = (Button) findViewById(R.id.n_button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingText.setText(str[1]);

            }
        });

        Button button6 = (Button) findViewById(R.id.n_button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingText.setText(str[2]);

            }
        });

        Button button7 = (Button) findViewById(R.id.n_button8);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingText.setText(str[3]);

            }
        });

        Button button9 = (Button) findViewById(R.id.button4);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingText.setText(str[4]);

            }
        });

        back.setOnClickListener(v -> {

            Intent send = new Intent(Frame_2.this,Frame_1.class);
            startActivity(send);
            finish();

        });








    }
}