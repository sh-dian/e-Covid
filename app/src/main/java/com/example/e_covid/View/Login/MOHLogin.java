package com.example.e_covid.View.Login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.e_covid.R;

import java.util.Objects;

public class MOHLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_mohlogin);
    }
}