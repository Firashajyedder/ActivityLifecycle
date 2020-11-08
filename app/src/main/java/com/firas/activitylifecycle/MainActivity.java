package com.firas.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected void onStart()
    {
        super.onStart();
        Log.d("Activity LifeCycle", "onStart");
    }
    protected void onResume()
    {
        super.onResume();
        Log.d("Activity LifeCycle", "onResume");
    }

    protected void onPause() {
        super.onPause();
        Log.d("Activity LifeCycle", "onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity LifeCycle", "onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity LifeCycle", "onDestroy");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity LifeCycle", "onRestart");
    }
}
