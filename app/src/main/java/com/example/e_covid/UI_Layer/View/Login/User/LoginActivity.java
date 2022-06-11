package com.example.e_covid.UI_Layer.View.Login.User;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.e_covid.R;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {

    Button mLogin;
    Button mRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_login);

        mLogin = findViewById(R.id.Login);
        mRegister = findViewById(R.id.RegistrationPage);
         mRegister.setOnClickListener(v -> {
             Intent intent = new Intent(LoginActivity.this, registration.class);
             startActivity(intent);
         });

        mLogin.setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this, User_MenuPage.class);
            startActivity(intent);
        });
    }
}