package com.example.work2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;

public class resulteActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resulte);

        Intent intent =getIntent();
        intent.putExtra("data","今天是安卓课程，老师是肖蓉。"+
                "上课时间是："+ Calendar.getInstance().getTime());
        setResult(888,intent);
        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("wcc", "onStart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("wcc", "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("wcc", "onDestroy: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("wcc", "onPause: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("wcc", "onResume: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("wcc", "onRestart: ");
    }
}