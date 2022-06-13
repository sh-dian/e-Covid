package com.example.e_covid.UI_Layer.View.UserQuarantine.User;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;


import com.example.e_covid.DomainLayer.Controller.QuarantineCenter.QuarantineCenterController;
import com.example.e_covid.DomainLayer.Controller.UserQuarantine.UserQuarantineController;
import com.example.e_covid.R;
import com.example.e_covid.UI_Layer.View.QuarantineCenter.Admin.Admin_AddQuarantineCenter;
import com.example.e_covid.UI_Layer.View.QuarantineCenter.Admin.Admin_QuarantineCenterMenu;

import java.util.Objects;

public class CenterQuarantineData extends AppCompatActivity {

    public ImageView BackArrow;
    public ImageView MeanPage;
    public Button Submit;

    String Id;
    String uqrType = "Center Quarantine";
    EditText uqrTestResult;
    EditText uqrDateTest;
    EditText uqrCurrentlyState;
    CheckBox uqrDisable;
    CheckBox uqrChestDiseases;

    private String UQR_QuarantineType ;
    private String UQR_DateTest ;
    private String UQ_DateTest;
    private String UQR_CurrentlyState ;
    private Boolean UQR_Disable ;
    private Boolean UQR_ChestDiseases ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_center_quarantine_data);

        Submit =findViewById(R.id.SubmitC);

        uqrTestResult = findViewById(R.id.TestResultC);
        uqrDateTest = findViewById(R.id.DateofTestC);
        uqrCurrentlyState = findViewById(R.id.CurrentlyStateC);
        uqrDisable = findViewById(R.id.DisableC);
        uqrChestDiseases = findViewById(R.id.ChestDiseasesC);

        Submit.setOnClickListener(view -> {
            addDataCenter();
        });


        BackArrow = findViewById (R.id.backto2);
        BackArrow.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CenterQuarantineData.this, QuarantineType.class);
                startActivity(intent);}});
        MeanPage = findViewById (R.id.Home1);
        MeanPage.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CenterQuarantineData.this, UserRegistration.class);
                startActivity(intent);}});


    }
    private void addDataCenter() {
        UQR_QuarantineType =  uqrType;
        UQR_DateTest = String.valueOf(Objects.requireNonNull(uqrTestResult).getText());
        UQ_DateTest = String.valueOf(Objects.requireNonNull(uqrDateTest.getText()));
        UQR_CurrentlyState  = String.valueOf(Objects.requireNonNull(uqrCurrentlyState).getText());
        UQR_Disable  = Boolean.valueOf(String.valueOf((uqrDisable).getText()));
        UQR_ChestDiseases  = Boolean.valueOf(String.valueOf((uqrChestDiseases).getText()));

    }

}