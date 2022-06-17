package com.example.e_covid.UI_Layer.View.UserQuarantine.User;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.e_covid.DomainLayer.Controller.UserQuarantine.UserQuarantineController;
import com.example.e_covid.R;

import java.util.Objects;

public class CenterQuarantineData extends AppCompatActivity {

    //button and image object
    public ImageView BackArrow;
    public ImageView MeanPage;
    public Button Submit;

    //controller object
    UserQuarantineController userQuarantineController;

    //EditText
    String uqrQuarantineType = "Center Quarantine";
    EditText uqrTestResult ;
    EditText uqrDateTest  ;
    EditText uqrCurrentlyState ;
    CheckBox uqrDisable;
    CheckBox uqrChestDiseases;

    //Value object
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
        setContentView(R.layout.activity_center_quarantine_data);


        Submit =findViewById(R.id.SubmitC);

        //input
        uqrTestResult   = findViewById(R.id.TestResult);
        uqrDateTest   = findViewById(R.id.DateofTest);
        uqrCurrentlyState  = findViewById(R.id.CurrentlyState);
        uqrDisable = findViewById(R.id.Disable);
        uqrChestDiseases = findViewById(R.id.ChestDiseases);

        //add button function for add new info of user center quarantine
        Submit.setOnClickListener(view -> {
            addCenterData();
        });

        //Image go 1 step back
        BackArrow = findViewById (R.id.Back020);
        BackArrow.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CenterQuarantineData.this,UserRegistration.class);
                startActivity(intent);}});
        //Image go mine menu of user quarantine
        MeanPage = findViewById (R.id.Home00);
        MeanPage.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CenterQuarantineData.this, UserRegistration.class);
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

    public void addCenterData(){
        UQR_QuarantineType = uqrQuarantineType;
        UQR_TestResult = String.valueOf((uqrDateTest.getText()));
        UQR_DateTest  = String.valueOf((uqrDateTest).getText());
        UQR_CurrentlyState  = String.valueOf((uqrCurrentlyState).getText());
        UQR_Disable  = Boolean.valueOf(String.valueOf((uqrDisable).getText()));
        UQR_ChestDiseases  = Boolean.valueOf(String.valueOf((uqrChestDiseases).getText()));

        Boolean checkInsertion = userQuarantineController.Add_QCenter(UQR_QuarantineType,UQR_TestResult,UQR_DateTest,UQR_CurrentlyState,UQR_Disable,
                UQR_ChestDiseases);


        if(checkInsertion == true){
            Toast.makeText(CenterQuarantineData.this, "Success", Toast.LENGTH_SHORT).show();

            //Pup up conform message
            alert();
        }else{
            Toast.makeText(CenterQuarantineData.this, "Failed", Toast.LENGTH_SHORT).show();
        }

    }
    private void alert(){
        AlertDialog dlg= new AlertDialog.Builder( CenterQuarantineData.this)
                .setTitle("Status of Submission").setMessage("Submit Successfully")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        Intent intent = new Intent(CenterQuarantineData.this,CenterQuarantineOptions.class);
                        startActivity(intent);}}).create();dlg.show();
    }
}