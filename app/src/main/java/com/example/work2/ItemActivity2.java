package com.example.work2;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ItemActivity2 extends AppCompatActivity {
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item2);

        textView = findViewById(R.id.itemtextview1);

        button = findViewById(R.id.itembutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ItemActivity2.this,resulteActivity.class);
                test.launch(intent);


            }
        });
    }

        public ActivityResultLauncher test;
        {
            test = registerForActivityResult(
                    new ActivityResultContracts.StartActivityForResult(),
                    new ActivityResultCallback<ActivityResult>() {

                        @Override
                        public void onActivityResult(ActivityResult result) {
                            if (result.getResultCode() == 888) {
                                Log.d("xr", "onActivityResultLauncher...");
                                textView.setText(result.getData().getStringExtra("data"));
                            }
                        }
                    });
        }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("sqp", "onStart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("sqp", "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("sqp", "onDestroy: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("sqp", "onPause: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("sqp", "onResume: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("sqp", "onRestart: ");
    }
}