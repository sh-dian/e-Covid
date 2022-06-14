package com.example.e_covid.UI_Layer.View.UserQuarantine.User;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.e_covid.R;
import java.util.Objects;

public class HomeQuarantineData extends AppCompatActivity {

    public ImageView BackArrow;
    public ImageView MeanPage;
    public Button Submit;

    String uqrQuarantineType = "Home Quarantine";
    EditText uqrTestResult ;
    EditText uqrDateTest  ;
    EditText uqrCurrentlyState ;
    CheckBox uqrDisable;
    CheckBox uqrChestDiseases;

    private String UQR_QuarantineType   ;
    private String UQR_TestResult   ;
    private String UQR_DateTest  ;
    private String UQR_CurrentlyState;
    private Boolean UQR_Disable  ;
    private Boolean UQR_ChestDiseases  ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_home_quarantine_data);

        Submit =findViewById(R.id.Save1);

        uqrTestResult   = findViewById(R.id.TestResult);
        uqrDateTest   = findViewById(R.id.DateofTest);
        uqrCurrentlyState  = findViewById(R.id.CurrentlyState);
        uqrDisable = findViewById(R.id.Disable);
        uqrChestDiseases = findViewById(R.id.ChestDiseases);

        Intent intent = new Intent(HomeQuarantineData.this, HomeLocation.class);
        startActivity(intent);

        //Submit.setOnClickListener(view -> {
          //  addHomeData();
        //});


        BackArrow = findViewById (R.id.Back020);
        BackArrow.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeQuarantineData.this,UserRegistration.class);
                startActivity(intent);}});
        MeanPage = findViewById (R.id.Home00);
        MeanPage.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeQuarantineData.this, UserRegistration.class);
                startActivity(intent);}});
    }
    public void getData(String QuarantineType , String TestResult   , String DateTest  ,
                        String CurrentlyState, Boolean Disable  , Boolean ChestDiseases  ){

        QuarantineType = UQR_QuarantineType;
        TestResult = UQR_TestResult ;
        DateTest = UQR_DateTest ;
        CurrentlyState = UQR_CurrentlyState ;
        Disable = UQR_Disable ;
        ChestDiseases  = UQR_ChestDiseases ;
    }

    public void addHomeData(){
        UQR_QuarantineType = uqrQuarantineType;
        UQR_TestResult = String.valueOf((uqrDateTest.getText()));
        UQR_DateTest  = String.valueOf((uqrDateTest).getText());
        UQR_CurrentlyState  = String.valueOf((uqrCurrentlyState).getText());
        UQR_Disable  = Boolean.valueOf(String.valueOf((uqrDisable).getText()));
        UQR_ChestDiseases  = Boolean.valueOf(String.valueOf((uqrChestDiseases).getText()));

  }
}