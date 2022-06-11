package com.example.e_covid.UI_Layer.View.UserQuarantine.User;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


//import androidx.appcompat.app.AppCompatActivity;

import com.example.e_covid.DataLayer.Model.UserQuarantine.UserQuarantineModel;
import com.example.e_covid.R;

import java.sql.Date;

public class HomeQuarantineData extends AppCompatActivity {



    public ImageView Image1;
    public ImageView Image2;

    EditText QType,  TestResult , DateofTest, CurrentlyState  ;
    CheckBox Disable, ChestDiseases;
    boolean testvalu;
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_quarantine_data);


        TestResult   = findViewById(R.id.TestResult);
        DateofTest   = findViewById(R.id.DateofTest);
        CurrentlyState  = findViewById(R.id.CurrentlyState);
        Disable = findViewById(R.id.Disable);
        ChestDiseases = findViewById(R.id.ChestDiseases);

        button = (Button) findViewById (R.id.Save1);
        button.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* UserQuarantineModel quM = new UserQuarantineModel(HomeQuarantineData.this);

                quM.addHome(TestResult.getText().toString().trim(),
                        Integer.valueOf(DateofTest.getText().toString().trim()),
                        CurrentlyState.getText().toString().trim(),
                        Boolean.valueOf(Disable.getText().toString().trim()) ,
                        Boolean.valueOf(ChestDiseases.getText().toString().trim()));*/
                         Intent intent = new Intent(HomeQuarantineData.this, HomeLocation.class);
                         startActivity(intent);



            }
        });

        Image1 = findViewById (R.id.backto2);
        Image1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeQuarantineData.this, QuarantineType.class);
                startActivity(intent);
            }
        });
        Image2 = findViewById (R.id.Home1);
        Image2.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeQuarantineData.this, UserRegistration.class);
                startActivity(intent);
            }
        });
    }

}