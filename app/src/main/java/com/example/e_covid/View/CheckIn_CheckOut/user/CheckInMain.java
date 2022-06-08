package com.example.e_covid.View.CheckIn_CheckOut.user;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;

import com.example.e_covid.R;
import com.example.e_covid.View.Login.AdminLogin;
import com.example.e_covid.View.Login.Admin_MenuPage;

import java.util.Objects;

public class CheckInMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //author code - hide action bar
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);


    }
}
