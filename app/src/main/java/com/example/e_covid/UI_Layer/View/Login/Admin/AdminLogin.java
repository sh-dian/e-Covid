package com.example.e_covid.UI_Layer.View.Login.Admin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.e_covid.R;

public class AdminLogin extends AppCompatActivity {

    Button mMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        mMenu = findViewById(R.id.admin_Login);
        mMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminLogin.this, Admin_MenuPage.class);
                startActivity(intent);
            }
        });
    }
}