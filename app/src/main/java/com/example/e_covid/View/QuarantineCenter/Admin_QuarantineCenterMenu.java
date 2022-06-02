package com.example.e_covid.View.QuarantineCenter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.e_covid.R;

public class Admin_QuarantineCenterMenu extends AppCompatActivity {

    //Button object
    Button a_Add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_quarantine_center_menu);

        a_Add = findViewById(R.id.a_buttonAdd);
        a_Add.setOnClickListener(view -> {
            Intent intent = new Intent(Admin_QuarantineCenterMenu.this, Admin_AddQuarantineCenter.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(),"Add Page", Toast.LENGTH_LONG).show();
        });
    }
}