package com.example.e_covid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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

        //mAdmin = findViewById(R.id.adminPage);
        mUser = findViewById(R.id.userPage);
        //mMoh = findViewById(R.id.MOHPage);

        mUser.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, User_MenuPage.class);
            startActivity(intent);
        });
    }
}