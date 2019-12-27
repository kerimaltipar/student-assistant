package com.example.studentassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class OrtalamaHesaplaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ortalama_hesapla);
    }

    public void Hesapla(View view)
    {
        EditText editText_vize = findViewById(R.id.editText2);
        EditText editText_final = findViewById(R.id.editText3);

        String vize_str = editText_vize.getText().toString();
        String final_str = editText_final.getText().toString();

        int vize_num = Integer.parseInt(vize_str);
        int final_num = Integer.parseInt(final_str);

        float ortalama = ((vize_num * 2) / 5) + ((final_num * 3) / 5);

        TextView textView_ortalama = findViewById(R.id.textView10);
        textView_ortalama.append(String.valueOf(ortalama));
    }
}
