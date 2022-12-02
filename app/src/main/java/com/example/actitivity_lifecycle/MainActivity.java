package com.example.actitivity_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Activity1","onCreate");
        button=findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d("Activity1","onStart : ");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("Activity1","onResume : ");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("Activity1","onPause : ");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("Activity1","onStop : ");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("Activity1","onDestroy : ");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d("Activity1","onRestart : ");
    }


}