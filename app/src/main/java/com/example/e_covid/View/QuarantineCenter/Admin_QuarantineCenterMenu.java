package com.example.e_covid.View.QuarantineCenter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.e_covid.Controller.QuarantineCenter.QuarantineCenterController;
import com.example.e_covid.R;

public class Admin_QuarantineCenterMenu extends AppCompatActivity {

    //controller object
    QuarantineCenterController adminQuarantineCenterController;

    //Button object
    Button a_Add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_quarantine_center_menu);

        a_Add = findViewById(R.id.a_buttonAdd);

        a_Add.setOnClickListener(view -> {
            addPage();
        });
    }

    private void addPage() {
        Intent intent = new Intent(Admin_QuarantineCenterMenu.this, Admin_AddQuarantineCenter.class);
        startActivity(intent);
    }
}