package com.example.actitivity_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class List_View extends AppCompatActivity {
    ArrayList<String> array=new ArrayList<>();
    ListView list;
    EditText text;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        array.add("Red");
        array.add("blue");
        array.add("green");

        list=findViewById(R.id.mylistview);
        text=findViewById(R.id.mytext);
        button=findViewById(R.id.mybutton);
        ArrayAdapter ad=new ArrayAdapter(this,
                andriod.R.layout.Simple_list_item,array);
        list.setAdapter(ad);

    }
}