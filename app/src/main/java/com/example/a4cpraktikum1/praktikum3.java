package com.example.a4cpraktikum1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class praktikum3 extends AppCompatActivity {

    Button btProsesLatihanToast;

    EditText etNamaLatihanToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktikum3);

        //coding dimulai dibawah sini
        btProsesLatihanToast = findViewById(R.id.btProsesLatihanToast);
        etNamaLatihanToast = findViewById(R.id.etNamaLatihanToast);

        btProsesLatihanToast.setOnClickListener(v -> {
            String isiToast = etNamaLatihanToast.getText().toString();
            Toast.makeText(getApplicationContext(),isiToast,Toast.LENGTH_SHORT).show();
        });
    }

}