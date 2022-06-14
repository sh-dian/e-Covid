package com.example.e_covid.UI_Layer.View.Movement.Admin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.e_covid.R;

public class admin_mvmentMenu extends AppCompatActivity {

    Button mSearchPerson;
    Button mSearchPremises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_mvment_menu);

        mSearchPerson = findViewById(R.id.adminSrchPerson);
        mSearchPremises = findViewById(R.id.adminSearchPremises);

        mSearchPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(admin_mvmentMenu.this, admin_view_person.class);
                startActivity(intent);
            }
        });

        mSearchPremises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(admin_mvmentMenu.this, admin_view_premises.class);
                startActivity(intent);
            }
        });
    }
}