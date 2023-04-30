package com.example.prac_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class simple_listview extends AppCompatActivity {

    ListView simpleList;
    String countryList[] = {"1.India", "2.China", "3.australia", "4.Portugle", "America", "NewZealand"
            ,"Germany","Japan","Canada","France"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_listview);
        simpleList = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_simple_listview, R.id.textView, countryList);
        simpleList.setAdapter(arrayAdapter);
    }
}