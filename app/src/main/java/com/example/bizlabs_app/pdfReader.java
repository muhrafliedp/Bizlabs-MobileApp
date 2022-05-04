package com.example.bizlabs_app;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class pdfReader extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(pdfReader.this, "Dokumen Business Plan Anda Berhasil Digenerate.", Toast.LENGTH_LONG);
        setContentView(R.layout.activity_pdf_reader);
    }
}