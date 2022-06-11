package com.example.e_covid.UI_Layer.View.Login.Admin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.e_covid.R;
import com.example.e_covid.UI_Layer.View.Login.MOH.ViewAdminMoh;
import com.example.e_covid.UI_Layer.View.QuarantineCenter.Admin.Admin_QuarantineCenterMenu;

import java.util.Objects;

public class Admin_MenuPage extends AppCompatActivity {

    Button qcMenuPage;
    Button mUserMenuPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //author code - hide action bar
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_admin_menu_page);

        qcMenuPage = findViewById(R.id.aQC_button);
        mUserMenuPage = findViewById(R.id.aManageUserBtn);

        qcMenuPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Admin_MenuPage.this, Admin_QuarantineCenterMenu.class);
                startActivity(intent);
            }
        });

        mUserMenuPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Admin_MenuPage.this, ViewAdminMoh.class);
                startActivity(intent);
            }
        });
    }
}