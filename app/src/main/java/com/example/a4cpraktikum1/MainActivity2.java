package com.example.a4cpraktikum1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button btProsesTugas;

    EditText etMasukkanNim;

    EditText etMasukkanNama;

    EditText etMasukkanprodi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btProsesTugas = findViewById(R.id.btProsesTugas);
        etMasukkanNim = findViewById(R.id.etMasukkanNim);
        etMasukkanNama = findViewById(R.id.etMasukkanNama);
        etMasukkanprodi = findViewById(R.id.etMasukkanProdi);

        btProsesTugas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nim = etMasukkanNim.getText().toString();
                String nama = etMasukkanNama.getText().toString();
                String prodi = etMasukkanprodi.getText().toString();

                //Buat pesan yang akan ditampilkan
                String message = "Hallo, perkenalkan saya " + nama + " dengan NIM " + nim + " pada program studi " + prodi;

                //Tampilkan notifikasi
                Toast.makeText(MainActivity2.this, message, Toast.LENGTH_LONG).show();
            }
        });
    }
}