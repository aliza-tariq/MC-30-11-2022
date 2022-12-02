package com.example.actitivity_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d("Activity2","onStart : ");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("Activity2","onResume : ");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("Activity2","onPause : ");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("Activity2","onStop : ");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("Activity2","onDestroy : ");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d("Activity2","onRestart : ");
    }

}