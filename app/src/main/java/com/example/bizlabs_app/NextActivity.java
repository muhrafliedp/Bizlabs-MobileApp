package com.example.bizlabs_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NextActivity extends AppCompatActivity {
    Button b, b7, b10, b11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        b = findViewById(R.id.imageButton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(NextActivity.this, BizplanActivity2.class);
                startActivity(i);
            }
        });
        b7 = findViewById(R.id.imageButton11);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), NextActivity2.class);
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
        b11 = findViewById(R.id.btnnexttochat);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), chat1.class);
                startActivity(i);
            }
        });
    }
}
