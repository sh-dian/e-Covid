package com.example.e_covid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.e_covid.View.QuarantineCenter.Admin_QuarantineCenterMenu;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Button qc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //author code - hide action bar
        //Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);

        qc = findViewById(R.id.quarantineCenter_button);
        qc.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Admin_QuarantineCenterMenu.class);
            startActivity(intent);
        });
    }
}