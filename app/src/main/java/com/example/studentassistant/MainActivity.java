package com.example.studentassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GecmeNotuHesapla(View view)
    {
        finish();
        Intent i = new Intent(this, GecmeNotuHesaplaActivity.class);
        startActivity(i);
    }

    public void  OrtalamaHesapla(View view)
    {
        finish();
        Intent i = new Intent(this, GecmeNotuHesaplaActivity.class);
        startActivity(i);
    }
}
