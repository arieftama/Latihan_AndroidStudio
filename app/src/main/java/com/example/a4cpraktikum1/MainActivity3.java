





package com.example.a4cpraktikum1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity3 extends AppCompatActivity {
    RadioGroup radioGroup1;
    RadioButton rbBiru,rbMerah,rbHijau;
    Button btProsesLatihanWarna;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        radioGroup1 = findViewById(R.id.radioGroup1);
        rbBiru = findViewById(R.id.rbBiru);
        rbMerah = findViewById(R.id.rbMerah);
        rbHijau = findViewById(R.id.rbHijau);
        btProsesLatihanWarna = findViewById(R.id.btProsesLatihanWarna);

        btProsesLatihanWarna.setOnClickListener(v->{
            if(rbBiru.isChecked()){
                btProsesLatihanWarna.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.blue));
            }else if (rbMerah.isChecked()){
                btProsesLatihanWarna.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.red));
            }else if (rbHijau.isChecked()){
                btProsesLatihanWarna.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.green));
            }
        });
    }
}