package com.example.e_covid.View.Login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.e_covid.R;

import java.util.Objects;

public class registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_registration);
    }
}