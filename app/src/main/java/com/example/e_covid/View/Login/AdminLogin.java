package com.example.e_covid.View.Login;

import android.content.Intent;
import android.support.v4.app.SupportActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

        //author code - hide action bar
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);

        qcPage = findViewById(R.id.qcBtn);
        qcPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminLogin.this, Admin_MenuPage.class);
                startActivity(intent);
            }
        });
    }
}