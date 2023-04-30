package com.example.prac_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class calculator_tablelayout extends AppCompatActivity implements View.OnClickListener {
  TextView t1;
 Button b1,b2,b3,b4,b5,b6,b7;
    Integer  wswitch;
    Double answer = 0.0;
    String res, res_plus, res_minus, res_times, res_divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_tablelayout);

        t1=findViewById(R.id.resultTextView);
        findViewById(R.id.buttoneql).setOnClickListener(this);
        findViewById(R.id.button0).setOnClickListener(this);
        findViewById(R.id.buttonPercent).setOnClickListener(this);
        findViewById(R.id.buttonSubtract).setOnClickListener(this);
        findViewById(R.id.button7).setOnClickListener(this);
        findViewById(R.id.button8).setOnClickListener(this);
        findViewById(R.id.button9).setOnClickListener(this);
        findViewById(R.id.buttonMultiply).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);
        findViewById(R.id.button6).setOnClickListener(this);
        findViewById(R.id.buttonDivide).setOnClickListener(this);
        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.buttonAdd).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                t1.append("1");

                break;
            case R.id.button2:
                t1.append("2");
                break;
            case R.id.button3:
                t1.append("3");
                break;
            case R.id.button4:
                t1.append("4");
                break;
            case R.id.button5:
                t1.append("5");
                break;
            case R.id.button6:
                t1.append("6");
                break;
            case R.id.button7:
                t1.append("7");
                break;
            case R.id.button8:
                t1.append("8");
                break;
            case R.id.button9:
                t1.append("9");
                break;
            case R.id.buttonAdd:
                t1.append("+");
                res_plus = t1.getText().toString();
                t1.setText("");
                wswitch = 1;
                break;
            case R.id.buttonSubtract:
                t1.append("-");
                res_minus = t1.getText().toString();
                t1.setText("");
                wswitch = 2;
                break;
            case R.id.buttonMultiply:
                t1.append("*");
                wswitch = 3;
                break;
            case R.id.buttonDivide:
                t1.append("/");
                wswitch = 4;
                break;
            case R.id.buttoneql:
                switch (wswitch){
                    case 1:
                        if (res_plus.matches("") || t1.getText().toString().matches("")){
                            t1.setText("");
                        }else {
                            answer = Double.parseDouble(res_plus) + Double.parseDouble(t1.getText().toString());
                            res = Double.toString(answer);
                            t1.setText(res);
                        }
                        break;


                    case 2:
                        if(res_minus.matches("") || t1.getText().toString().matches("")){
                            t1.setText("");
                        }else{
                            answer = Double.parseDouble(res_minus)-Double.parseDouble(t1.getText().toString());
                            res = Double.toString(answer);
                            t1.setText(res);
                        }
                        break;
                }
    }
}
}