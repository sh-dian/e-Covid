package com.example.e_covid.UI_Layer.View.Vaccination.User;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.e_covid.R;

public class VaccinationMain extends AppCompatActivity {

    Button vApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccination_main);

        vApp = (Button) findViewById(R.id.vcAppBttn);

        vApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VaccinationMain.this, ViewAppointment.class);
                startActivity(intent);
            }
        });
    }
}