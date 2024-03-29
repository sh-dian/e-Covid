package com.example.e_covid.UI_Layer.View.Login.Admin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.e_covid.R;
import com.example.e_covid.UI_Layer.View.Login.MOH.View_Admin_Moh;
import com.example.e_covid.UI_Layer.View.Movement.Admin.admin_mvmentMenu;
import com.example.e_covid.UI_Layer.View.QuarantineCenter.Admin.Admin_QuarantineCenterMenu;
import com.example.e_covid.UI_Layer.View.UserQuarantine.Admin.Admin_DashboardUserQ;

public class Admin_Menu_Page extends AppCompatActivity {

    Button qcMenuPage;
    Button mUserMenuPage;
    Button aUserQuarantine;
    Button mMovement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //author code - hide action bar
        setContentView(R.layout.activity_admin_menu_page);

        qcMenuPage = findViewById(R.id.aQC_button);
        mUserMenuPage = findViewById(R.id.aManageUserBtn);
        aUserQuarantine = findViewById(R.id.aUserQuarantine_btn);
        mMovement = findViewById(R.id.aCheckIn_btn);

        qcMenuPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Admin_Menu_Page.this, Admin_QuarantineCenterMenu.class);
                startActivity(intent);
            }
        });

        mUserMenuPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Admin_Menu_Page.this, View_Admin_Moh.class);
                startActivity(intent);
            }
        });

        aUserQuarantine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Admin_Menu_Page.this, Admin_DashboardUserQ.class);
                startActivity(intent);
            }
        });

        mMovement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Admin_Menu_Page.this, admin_mvmentMenu.class);
                startActivity(intent);
            }
        });
    }
}