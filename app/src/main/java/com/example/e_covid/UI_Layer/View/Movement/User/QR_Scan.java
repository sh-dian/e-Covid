package com.example.e_covid.UI_Layer.View.Movement.User;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.e_covid.R;

import java.util.Objects;

public class QR_Scan extends AppCompatActivity {

    Button mCheckIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();

        setContentView(R.layout.activity_qr_scan);

        mCheckIn = findViewById(R.id.uScanCheckIn);
        mCheckIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QR_Scan.this, CheckIn_Info.class);
                startActivity(intent);
            }
        });
    }
}