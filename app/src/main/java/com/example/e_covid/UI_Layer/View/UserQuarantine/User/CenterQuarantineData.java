package com.example.e_covid.UI_Layer.View.UserQuarantine.User;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

//import androidx.appcompat.app.AppCompatActivity;

import com.example.e_covid.DataLayer.Model.UserQuarantine.UserQuarantineModel;
import com.example.e_covid.R;

public class CenterQuarantineData extends AppCompatActivity {


    public ImageView Image1;
    public ImageView Image2;

    public String QType = "Center Quarantine";
    EditText TestResult , DateofTest, CurrentlyState  ;
    CheckBox Disable, ChestDiseases;
    boolean testvalu;
    public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_center_quarantine_data);



        TestResult   = findViewById(R.id.TestResult2);
        DateofTest   = findViewById(R.id.DateofTest2);
        CurrentlyState  = findViewById(R.id.CurrentlyState2);
        Disable = findViewById(R.id.Disable2);
        ChestDiseases = findViewById(R.id.ChestDiseases2);



        button = (Button) findViewById (R.id.save2);
        button.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                UserQuarantineModel quM = new UserQuarantineModel(CenterQuarantineData.this);
                testvalu =  quM.addHome( QType,
                        TestResult.getText().toString().trim(),
                        Integer.valueOf(DateofTest.getText().toString().trim()),
                        CurrentlyState.getText().toString().trim(),
                        Boolean.valueOf(Disable.getText().toString().trim()) ,
                        Boolean.valueOf(ChestDiseases.getText().toString().trim()));

             if(testvalu == true){
                    Intent intent = new Intent(CenterQuarantineData.this, CenterQuarantineOptions.class);
                    startActivity(intent);
             }
            }
        });

        Image1 = findViewById (R.id.backto2);
        Image1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CenterQuarantineData.this, QuarantineType.class);
                startActivity(intent);
            }
        });
        Image2 = findViewById (R.id.Home1);
        Image2.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CenterQuarantineData.this, UserRegistration.class);
                startActivity(intent);
            }
        });
    }
}