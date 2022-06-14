package com.example.e_covid.UI_Layer.View.UserQuarantine.User;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.e_covid.R;

import java.util.Objects;

public class CenterQuarantineData extends AppCompatActivity {


    public ImageView BackArrow;
    public ImageView MeanPage;
    public Button Submit;

    public String QType = "Center Quarantine";
    EditText TestResult , DateofTest, CurrentlyState  ;
    CheckBox Disable, ChestDiseases;
    boolean testvalu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_center_quarantine_data);


        /*
        TestResult   = findViewById(R.id.TestResult2);
        DateofTest   = findViewById(R.id.DateofTest2);
        CurrentlyState  = findViewById(R.id.CurrentlyState2);
        Disable = findViewById(R.id.Disable2);
        ChestDiseases = findViewById(R.id.ChestDiseases2);



        Submit = (Button) findViewById (R.id.save2);
        Submit.setOnClickListener (new View.OnClickListener() {
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

        BackArrow = findViewById (R.id.backto2);
        BackArrow.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CenterQuarantineData.this, QuarantineType.class);
                startActivity(intent);
            }
        });
        MeanPage = findViewById (R.id.Home1);
        MeanPage.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CenterQuarantineData.this, UserRegistration.class);
                startActivity(intent);
            }
        });*/
    }
}