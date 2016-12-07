package com.example.navyaspc.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Mytag", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Mytag", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Mytag", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Mytag", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Mytag", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Mytag", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Mytag", "onRestart");
    }
}
