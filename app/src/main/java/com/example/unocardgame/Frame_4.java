package com.example.unocardgame;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class Frame_4 extends AppCompatActivity {

    int oldValue;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame4);
        changeTextViewValueRandomlyOnButtonClick();

    }



    private void changeTextViewValueRandomlyOnButtonClick() {
        final String[] str = {"Answer is :  8/108 =  0.07", "Answer is : 4/108 =  0.03","Answer is : 100/108 = 0.92"};
        final TextView changingText = (TextView) findViewById(R.id.textView8);
        final TextView text = (TextView) findViewById(R.id.textView7);
        changingText.setTextSize(40);
        changingText.setTextColor(Color.parseColor("#000000"));
        text.setTextColor(Color.parseColor("#000000"));
        Button button1 = (Button) findViewById(R.id.l_button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingText.setText(str[0]);
                changingText.setTextSize(40);


            }
        });

        Button button2 = (Button) findViewById(R.id.l_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingText.setText(str[1]);

            }
        });

        Button button3 = (Button) findViewById(R.id.l_button2);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingText.setText(str[1]);

            }
        });

        Button button6 = (Button) findViewById(R.id.l_button3);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingText.setText(str[2]);

            }
        });

        Button back = (Button) findViewById(R.id.l_button4);
        back.setOnClickListener(v -> {

            Intent send = new Intent(Frame_4.this,Frame_1.class);
            startActivity(send);
            finish();

        });










    }
}