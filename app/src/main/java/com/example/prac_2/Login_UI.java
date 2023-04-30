package com.example.prac_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login_UI extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_ui);
        e1=findViewById(R.id.fname);
        e2=findViewById(R.id.lname);
        e3=findViewById(R.id.uname);
        e4=findViewById(R.id.pass);
        e5=findViewById(R.id.re_enterpass);
        e6=findViewById(R.id.eid);
        b1=findViewById(R.id.btn);

        b1.setOnClickListener(new View.OnClickListener() {

            String pw=e4.getText().toString();
            String cpw=e5.getText().toString();
            @Override
            public void onClick(View v) {
                if (e1.getText().toString().isEmpty() || e2.getText().toString().isEmpty() || e3.getText().toString().isEmpty() || pw.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please fill required field", Toast.LENGTH_LONG).show();

                } else if (!pw.equals(cpw)) {

                    Toast.makeText(getApplicationContext(), "Password does not match", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Registration successfull.....", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}