package com.example.e_covid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.e_covid.View.Login.Admin.AdminLogin;
import com.example.e_covid.View.Login.MOH.MOHLogin;
import com.example.e_covid.View.Login.User.LoginActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Button mUser;
    Button mAdmin;
    Button mMoh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //author code - hide action bar
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);

        mAdmin = findViewById(R.id.adminPage);
        mUser = findViewById(R.id.userPage);
        mMoh = findViewById(R.id.MOHPage);

        mUser.setOnClickListener(view -> openUserLogin());
        mAdmin.setOnClickListener(view -> openAdminLogin());
        mMoh.setOnClickListener(view -> openMOHLogin());
    }

    private void openMOHLogin() {
        Intent intent = new Intent(MainActivity.this, MOHLogin.class);
        startActivity(intent);
    }

    private void openAdminLogin() {
        Intent intent = new Intent(MainActivity.this, AdminLogin.class);
        startActivity(intent);
    }

    private void openUserLogin() {
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}