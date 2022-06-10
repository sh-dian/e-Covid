package com.example.e_covid.View.CheckIn_CheckOut.User;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.e_covid.R;

import java.util.Objects;

public class MovementMain extends AppCompatActivity {

    Button mCheckIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //author code - hide action bar
        Objects.requireNonNull(getSupportActionBar()).hide();

        setContentView(R.layout.activity_movement_main);

        mCheckIn = findViewById(R.id.uCheckInBtn);
        mCheckIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MovementMain.this, QR_Scan.class);
                startActivity(intent);
            }
        });
    }
}