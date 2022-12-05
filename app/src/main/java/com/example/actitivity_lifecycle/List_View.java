package com.example.actitivity_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class List_View extends AppCompatActivity {
    ArrayList<String> arrayList=new ArrayList<>();
    ListView list;
    EditText text;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        arrayList.add("Red");
        arrayList.add("blue");
        arrayList.add("green");

        list=findViewById(R.id.mylistview);
        text=findViewById(R.id.mytext1);
        button=findViewById(R.id.mybutton);
        ArrayAdapter ad=new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,arrayList);
        list.setAdapter(ad);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayList.add(text.getText().toString());
               // list.setAdapter(ad);
                ad.notifyDataSetChanged(); //to notify data chnage/added same as above

            }
        });

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //when we click on any list item button text change
                button.setText(arrayList.get(i)); //index
            }
        });
    }
}