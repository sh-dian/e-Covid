package com.example.e_covid.UI_Layer.View.Vaccination.User;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.e_covid.R;

import java.util.Objects;

public class ViewVaccinationCertificate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_view_vaccination_certificate);
    }
}