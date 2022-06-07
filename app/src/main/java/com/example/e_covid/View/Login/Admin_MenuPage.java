package com.example.e_covid.View.Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.e_covid.MainActivity;
import com.example.e_covid.R;
import com.example.e_covid.View.QuarantineCenter.Admin_QuarantineCenterMenu;

public class Admin_MenuPage extends AppCompatActivity {

    Button qcMenuPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_menu_page);

        qcMenuPage = findViewById(R.id.qcMenu_button);
        qcMenuPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Admin_MenuPage.this, Admin_QuarantineCenterMenu.class);
                startActivity(intent);
            }
        });
    }
}