package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        (findViewById(R.id.textview)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                (Toast.makeText(MainActivity.this, "Hello World", Toast.LENGTH_LONG)).show();
            }
        });


        Log.d("Test", "This is a test!");
    }
}