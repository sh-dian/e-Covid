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

//import androidx.appcompat.app.AppCompatActivity;

import com.example.e_covid.R;

import java.util.Objects;

public class HomeLocation extends AppCompatActivity {

    public ImageView BackArrow;
    public ImageView MeanPage;
    public Button Submit;

    EditText uqrLocation ;
    EditText uqrPeopleNU ;
    EditText uqrDateStart ;

    private String UQR_Location  ;
    private String UQR_PeopleNU  ;
    private String UQR_DateStart ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_home_location);

        Submit =findViewById(R.id.SubmitHome);

        uqrLocation   = findViewById(R.id.Location);
        uqrPeopleNU   = findViewById(R.id.PeopleNumber);
        uqrDateStart  = findViewById(R.id.DateS);

        Submit.setOnClickListener(view -> {
            addHomeLocation();
        });


        BackArrow = findViewById (R.id.Back00);
        BackArrow.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeLocation.this,HomeQuarantineData.class);
                startActivity(intent);}});
        MeanPage = findViewById (R.id.Home00);
        MeanPage.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeLocation.this, UserRegistration.class);
                startActivity(intent);}});
    }


    private void addHomeLocation() {
        UQR_Location = String.valueOf(Objects.requireNonNull(uqrLocation).getText());
        UQR_PeopleNU = String.valueOf(Objects.requireNonNull(uqrPeopleNU.getText()));
        UQR_DateStart  = String.valueOf(Objects.requireNonNull(uqrDateStart).getText());
        alert();
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
