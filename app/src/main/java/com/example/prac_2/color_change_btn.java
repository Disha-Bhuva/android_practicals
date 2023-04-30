package com.example.prac_2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class color_change_btn extends AppCompatActivity {
Button b1,b2,b3;
LinearLayout l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_change_btn);

        b1=findViewById(R.id.red);
        b2=findViewById(R.id.blue);
        b3=findViewById(R.id.green);
        l=findViewById(R.id.l1);
       b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               l.setBackgroundColor(Color.RED);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l.setBackgroundColor(Color.BLUE);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l.setBackgroundColor(Color.GREEN);
            }
        });
    }
}