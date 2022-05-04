package com.example.bizlabs_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NextActivity2 extends AppCompatActivity {
    Button b9, b10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next2);
        b9 = findViewById(R.id.imageButton21);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), NextActivity.class);
                startActivity(i);
            }
        });
        b10 = findViewById(R.id.btnnexttoclass);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), class1.class);
                startActivity(i);
            }
        });
    }
}