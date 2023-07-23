package com.example.unocardgame;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Frame_3 extends AppCompatActivity {

    int oldValue;

    Button back;
    TextView text1,text2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame3);
        changeTextViewValueRandomlyOnButtonClick();

        text1 = findViewById(R.id.textView5);


        text1.setTextSize(20);
        text1.setTextColor(Color.parseColor("#0000FF"));

        text2 = findViewById(R.id.textView9);

        text2.setTextSize(20);
        text2.setTextColor(Color.parseColor("#0000FF"));

    }



    private void changeTextViewValueRandomlyOnButtonClick() {
        final String[] str = {"Answer is :  24/108 = 0.22", "Answer is : 8/108 = 0.07","Answer is : 2/108 = 0.018"};
        final TextView changingText = (TextView) findViewById(R.id.textView6);
        changingText.setTextSize(40);
        changingText.setTextColor(Color.parseColor("#000000"));
        final TextView text = (TextView) findViewById(R.id.textView5);
        text.setTextColor(Color.parseColor("#000000"));
        Button button1 = (Button) findViewById(R.id.button);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingText.setText(str[0]);
                changingText.setTextSize(40);


            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingText.setText(str[1]);

            }
        });

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingText.setText(str[1]);

            }
        });

        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingText.setText(str[1]);

            }
        });



        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingText.setText(str[2]);

            }
        });
        Button back = (Button) findViewById(R.id.button8);
        back.setOnClickListener(v -> {

            Intent send = new Intent(Frame_3.this,Frame_1.class);
            startActivity(send);
            finish();

        });






    }
}