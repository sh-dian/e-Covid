package com.example.e_covid.UI_Layer.View.UserQuarantine.User;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

//import androidx.appcompat.app.AppCompatActivity;

import com.example.e_covid.DomainLayer.Controller.UserQuarantine.UserQuarantineController;
import com.example.e_covid.R;

import java.util.Objects;

public class HomeLocation extends AppCompatActivity {

    //button and image object
    public ImageView BackArrow;
    public ImageView MeanPage;
    public Button Submit;

    //controller object
    UserQuarantineController userQuarantineController;
    HomeQuarantineData hqd = new HomeQuarantineData();

    //Value to save the HomeQuarantineData on it to save all in one  sql table
    String Quarantinetype;
    String Testresult ;
    String Datetest ;
    String Currentlystate ;
    Boolean Disablee ;
    Boolean Chestdiseases  ;

    //EditText
    EditText uqrLocation ;
    EditText uqrPeopleNU ;
    EditText uqrDateStart ;

    //Value object
    private String UQR_Location  ;
    private int UQR_PeopleNU  ;
    private String UQR_DateStart ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_home_location);


        Submit =findViewById(R.id.SubmitHome);

        //input
        uqrLocation   = findViewById(R.id.Location);
        uqrPeopleNU   = findViewById(R.id.PeopleNumber);
        uqrDateStart  = findViewById(R.id.DateS);

        userQuarantineController = new UserQuarantineController(this);

        //add button function for add new info of user home quarantine
        Submit.setOnClickListener(view -> {
            addHomeLocation();
        });

        //Image go 1 step back
        BackArrow = findViewById (R.id.Back000);
        BackArrow.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeLocation.this,HomeQuarantineData.class);
                startActivity(intent);}});
        //Image go mine menu of user quarantine
        MeanPage = findViewById (R.id.Home00);
        MeanPage.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeLocation.this, UserRegistration.class);
                startActivity(intent);}});
    }


    private void addHomeLocation() {

        //to get the data from HomeQuarantineData class
        hqd.getData(Quarantinetype,Testresult,Datetest,Currentlystate,Disablee,Chestdiseases);

        //Save the data in this class object
        String UQR_QuarantineType = Quarantinetype;
        String UQR_TestResult = Testresult;
        String UQR_DateTest  = Datetest;
        String UQR_CurrentlyState  = Currentlystate;
        Boolean UQR_Disable  = Disablee;
        Boolean UQR_ChestDiseases  = Chestdiseases;

        UQR_Location = String.valueOf(Objects.requireNonNull(uqrLocation).getText());
        UQR_PeopleNU = Integer.parseInt(String.valueOf((uqrPeopleNU).getText()));
        UQR_DateStart  = String.valueOf(Objects.requireNonNull(uqrDateStart).getText());


        Boolean checkInsertion = userQuarantineController.Add_QHome(UQR_QuarantineType,UQR_TestResult,UQR_DateTest,UQR_CurrentlyState,UQR_Disable,
                UQR_ChestDiseases,UQR_Location,UQR_PeopleNU,UQR_DateStart);

        if(checkInsertion == true){
            Toast.makeText(HomeLocation.this, "Success", Toast.LENGTH_SHORT).show();

            //Pup up conform message
            alert();
        }else{
            Toast.makeText(HomeLocation.this, "Failed", Toast.LENGTH_SHORT).show();
        }
    }

    private void alert(){
        AlertDialog dlg= new AlertDialog.Builder( HomeLocation.this)
                .setTitle("Status of Submission").setMessage("Submit Successfully")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        Intent intent = new Intent(HomeLocation.this,UserRegistration.class);
                        startActivity(intent);}}).create();dlg.show();
    }

}
