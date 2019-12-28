package com.example.studentassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class GecmeNotuHesaplaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gecme_notu_hesapla);

        setTitle("Gecme Notu Hesapla");
    }

    public void Hesapla(View view)
    {
        EditText vize = findViewById(R.id.editText);
        String str_vize = vize.getText().toString();
        int vize_num = Integer.parseInt(str_vize);

        //Log.d("vize_num", String.valueOf(vize_num));

        // AA
        float aa = (410 - ((float)vize_num * 2)) / 3;
        // BA
        float ba = (370 - ((float)vize_num * 2)) / 3;
        // BB
        float bb = (325 - ((float)vize_num * 2)) / 3;
        // CB
        float cb = (290 - ((float)vize_num * 2)) / 3;
        // CC
        float cc = (250 - ((float)vize_num * 2)) / 3;
        // DC
        float dc = (200 - ((float)vize_num * 2)) / 3;



        TextView textView_aa = findViewById(R.id.textView2);
        TextView textView_ba = findViewById(R.id.textView3);
        TextView textView_bb = findViewById(R.id.textView6);
        TextView textView_cb = findViewById(R.id.textView7);
        TextView textView_cc = findViewById(R.id.textView8);
        TextView textView_dc = findViewById(R.id.textView9);

        textView_aa.append(String.valueOf(Math.round(aa)));
        textView_ba.append(String.valueOf(Math.round(ba)));
        textView_bb.append(String.valueOf(Math.round(bb)));
        textView_cb.append(String.valueOf(Math.round(cb)));
        textView_cc.append(String.valueOf(Math.round(cc)));
        textView_dc.append(String.valueOf(Math.round(dc)));

        //Log.d("aa", String.valueOf(aa));

        // Close keyboard
        InputMethodManager inputManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
    }
}
