package com.example.studentassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class OrtalamaHesaplaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ortalama_hesapla);

        setTitle("Ortalama Hesapla");
    }

    public void Hesapla(View view)
    {
        String ortalama_text = "Ortalama: ";
        EditText editText_vize = findViewById(R.id.editText2);
        EditText editText_final = findViewById(R.id.editText3);

        String vize_str = editText_vize.getText().toString();
        String final_str = editText_final.getText().toString();

        int vize_num = Integer.parseInt(vize_str);
        int final_num = Integer.parseInt(final_str);

        float ortalama = (((float)vize_num * 2) / 5) + (((float)final_num * 3) / 5);


        TextView textView_ortalama = findViewById(R.id.textView10);
        textView_ortalama.setText(ortalama_text);
        textView_ortalama.append(String.valueOf(ortalama));
        textView_ortalama.append(" " + FindGrade(ortalama));

        // Close keyboard
        InputMethodManager inputManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
    }

    public String FindGrade(float ortalama)
    {
        // AA
        if(ortalama >= 82)
        {
            return "AA";
        }
        // BA
        else if(ortalama >= 74)
        {
            return "BA";
        }
        // BB
        else if(ortalama >= 65)
        {
            return "BB";
        }
        // CB
        else if(ortalama >= 58)
        {
            return "CB";
        }
        // CC
        else if(ortalama >= 50)
        {
            return "CC";
        }
        // DC
        else if (ortalama >= 40)
        {
            return "DC";
        }
        // DD
        else if(ortalama >= 35)
        {
            return "DD";
        }
        // FD
        else if(ortalama >= 25)
        {
            return "FD";
        }
        // FF
        else
        {
            return "FF";
        }
    }
}
