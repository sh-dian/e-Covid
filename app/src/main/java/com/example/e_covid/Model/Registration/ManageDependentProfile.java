package com.example.e_covid.Model.Registration;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.e_covid.R;

import java.util.Objects;

public class ManageDependentProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_manage_dependent_profile);
    }
}