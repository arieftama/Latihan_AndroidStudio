package com.example.a4cpraktikum1;

import androidx.appcompat.app.AppCompatActivity;

import android.net.EthernetNetworkSpecifier;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btProses;
    EditText etNama, etHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //coding disini
        btProses = findViewById(R.id.btProses);
        etNama = findViewById(R.id.etNama);
        etHasil = findViewById(R.id.etHasil);

        btProses.setOnClickListener(V -> {
            etHasil.setText(etNama.getText());
        });
    }
}