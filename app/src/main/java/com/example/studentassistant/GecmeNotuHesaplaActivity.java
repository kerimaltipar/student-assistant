package com.example.studentassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GecmeNotuHesaplaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gecme_notu_hesapla);
    }

    public void Hesapla(View view)
    {
        EditText vize = findViewById(R.id.editText);
        String str_vize = vize.getText().toString();
        int vize_num = Integer.parseInt(str_vize);

        // AA
        float aa = (410 - (vize_num * 2)) / 3;
        // BA
        float ba = (370 - (vize_num * 2)) / 3;
        // BB
        float bb = (325 - (vize_num * 2)) / 3;
        // CB
        float cb = (290 - (vize_num * 2)) / 3;
        // CC
        float cc = (250 - (vize_num * 2)) / 3;
        // DC
        float dc = (200 - (vize_num * 2)) / 3;

        TextView textView_aa = findViewById(R.id.textView2);
        TextView textView_ba = findViewById(R.id.textView3);
        TextView textView_bb = findViewById(R.id.textView6);
        TextView textView_cb = findViewById(R.id.textView7);
        TextView textView_cc = findViewById(R.id.textView8);
        TextView textView_dc = findViewById(R.id.textView9);

        textView_aa.append(String.valueOf(aa));
        textView_ba.append(String.valueOf(ba));
        textView_bb.append(String.valueOf(bb));
        textView_cb.append(String.valueOf(cb));
        textView_cc.append(String.valueOf(cc));
        textView_dc.append(String.valueOf(dc));
    }
}
