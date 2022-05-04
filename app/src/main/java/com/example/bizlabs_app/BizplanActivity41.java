package com.example.bizlabs_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BizplanActivity41 extends AppCompatActivity {
    Button b6, b0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bizplan41);
        b6 = findViewById(R.id.btnnexttoaspekbisnis7);
        b0 = findViewById(R.id.btnbacktohome);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), BizplanActivity5.class);
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