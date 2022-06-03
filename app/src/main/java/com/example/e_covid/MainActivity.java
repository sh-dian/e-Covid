package com.example.e_covid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.e_covid.View.QuarantineCenter.Admin_AddQuarantineCenter;
import com.example.e_covid.View.QuarantineCenter.Admin_QuarantineCenterMenu;

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

        mUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, User_MenuPage.class);
                startActivity(intent);
            }
        });
    }
}