package com.example.bizlabs_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BizplanActivity2 extends AppCompatActivity {
    Button b1, b0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bizplan2);
        b1 = findViewById(R.id.btnnexttoaspekbisnis2);
        b0 = findViewById(R.id.btnbacktohome);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), BizplanActivity21.class);
                startActivity(i);
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), NextActivity.class);
                startActivity(i);
            }
        });
    }
}