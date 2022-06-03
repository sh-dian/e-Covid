package com.example.e_covid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Button mAdmin, mUser,mMoh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //author code - hide action bar
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);

        //Go to Admin Login Page
        mAdmin = findViewById(R.id.adminPage);
        mAdmin.setOnClickListener(view -> {
            //Intent intent = new Intent(MainActivity.this, Admin_QuarantineCenterMenu.class);
            //startActivity(intent);
        });

        //Go to MOH staff Login Page
        mMoh = findViewById(R.id.MOHPage);
        mMoh.setOnClickListener(view -> {
            //Intent intent = new Intent(MainActivity.this, Admin_QuarantineCenterMenu.class);
            //startActivity(intent);
        });

        //Go to User Login Page
        mUser = findViewById(R.id.userPage);
        mUser.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, User_MenuPage.class);
            startActivity(intent);
        });
    }
}