package com.example.e_covid.UI_Layer.View.Login.MOH;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.e_covid.R;
import com.example.e_covid.UI_Layer.View.Login.Admin.Admin_Menu_Page;
import com.example.e_covid.UI_Layer.View.UserQuarantine.Admin.Admin_DashboardUserQ;
import com.example.e_covid.UI_Layer.View.UserQuarantine.MOH.MOH_DashboardUserQ;

import java.util.Objects;

public class MOH_Menu_Page extends AppCompatActivity {

    Button mUserMenuPage;
    Button aUserQuarantine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //author code - hide action bar
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_moh_menu_page);

        mUserMenuPage = findViewById(R.id.mohManageUserBtn);

        mUserMenuPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MOH_Menu_Page.this, View_Admin_Moh.class);
                startActivity(intent);
            }
        });

        aUserQuarantine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MOH_Menu_Page.this, MOH_DashboardUserQ.class);
                startActivity(intent);
            }
        });
    }
}