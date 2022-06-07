package com.example.e_covid.View.Login;

import android.content.Intent;
import android.support.v4.app.SupportActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.example.e_covid.MainActivity;
import com.example.e_covid.R;
import com.example.e_covid.View.QuarantineCenter.Admin_QuarantineCenterMenu;

import java.util.Objects;

public class AdminLogin extends AppCompatActivity {

    Button qcPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_admin_login);

        qcPage = findViewById(R.id.qcBtn);

        qcPage.setOnClickListener(view -> {
            Intent intent = new Intent(AdminLogin.this, Admin_QuarantineCenterMenu.class);
            startActivity(intent);
        });
    }
}