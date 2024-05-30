package com.example.a4cpraktikum1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class latihan4 extends AppCompatActivity {

    EditText etInput1Latihan4, etInput2Latihan4;
    TextView tvHasilLatihan4;
    Button btProsesLatihan4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.latihan4);

        btProsesLatihan4 = findViewById(R.id.btProsesLatihan4);
        etInput1Latihan4 = findViewById(R.id.etInput1Latihan4);
        etInput2Latihan4 = findViewById(R.id.etInput2Latihan4);
        tvHasilLatihan4 = findViewById(R.id.tvHasilLatihan4);

        btProsesLatihan4.setOnClickListener(v -> {
           int input1 = Integer.parseInt(etInput1Latihan4.getText().toString());
           int input2 = Integer.parseInt(etInput2Latihan4.getText().toString());
           int hitung = 0;
           String hasil = "Hasil : ";
           for (int i = 1; i <= input2; i++){
               hitung = input1 * i;
               hasil = hasil + "\n" + input1 + " x " + i + " = " + hitung;
           }
           tvHasilLatihan4.setText(hasil);
        });
    }
}