package com.example.e_covid.UI_Layer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.e_covid.UI_Layer.View.Login.Admin.Admin_Login;
import com.example.e_covid.UI_Layer.View.Login.MOH.MOH_Login;
import com.example.e_covid.UI_Layer.View.Login.User.User_Login;
import com.example.e_covid.R;

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
        Intent intent = new Intent(MainActivity.this, MOH_Login.class);
        startActivity(intent);
    }

    private void openAdminLogin() {
        Intent intent = new Intent(MainActivity.this, Admin_Login.class);
        startActivity(intent);
    }

    private void openUserLogin() {
        Intent intent = new Intent(MainActivity.this, User_Login.class);
        startActivity(intent);
    }
}