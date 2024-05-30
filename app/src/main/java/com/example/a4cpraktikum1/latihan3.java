package com.example.a4cpraktikum1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class latihan3 extends AppCompatActivity {

    Button btProsesLatihanWarna2;
    Spinner colorSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.latihan3);

        btProsesLatihanWarna2 = findViewById(R.id.btProsesLatihanWarna2);
        colorSpinner = findViewById(R.id.colorSpinner);

        btProsesLatihanWarna2.setOnClickListener(v -> {
            int pilihWarna = colorSpinner.getSelectedItemPosition();
            switch (pilihWarna){
                case 1:
                    btProsesLatihanWarna2.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.red));
                    break;
                case 2:
                    btProsesLatihanWarna2.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.green));
                    break;
                case 3:
                    btProsesLatihanWarna2.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.blue));
                    break;
                default:
                    Toast.makeText(getApplicationContext(),"Mohon Maaf Pilihannya Tidak Ada",Toast.LENGTH_LONG).show();
            }
        });
    }
}