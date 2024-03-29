package com.example.e_covid.UI_Layer.View.Vaccination.User;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.e_covid.R;

import java.util.Objects;

public class VaccinationMain extends AppCompatActivity {

    Button mView;
    Button mCert;
    Button mDependent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_vaccination_main);

        mView = findViewById(R.id.vcAppBttn);
        mCert = findViewById(R.id.vcCertBttn);
        mDependent = findViewById(R.id.deptBttn);

        mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VaccinationMain.this, ViewAppointment.class);
                startActivity(intent);
            }
        });

        mCert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VaccinationMain.this, ViewVaccinationCertificate.class);
                startActivity(intent);
            }
        });

        mDependent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VaccinationMain.this, DependentVaccineDetails.class);
                startActivity(intent);
            }
        });
    }
}