package com.example.e_covid.UI_Layer.View.Movement.User;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.e_covid.DomainLayer.Controller.Movement.MovementController;
import com.example.e_covid.R;


import java.util.Objects;

public class UserCheckIn extends AppCompatActivity {

    MovementController addmovementController;

    Button mCheckIn;

    TextInputLayout cioLocation;
    TextInputLayout cioDate;
    TextInputLayout cioTime;

    private String CIO_Location;
    private String CIO_Date;
    private String CIO_Time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_qr_scan);


        //button add id
        mCheckIn = findViewById(R.id.uScanCheckIn);

        //input
        cioLocation = findViewById(R.id.textCheckInLocation);
        cioDate= findViewById(R.id.textCheckInDate);
        cioTime = findViewById(R.id.textCheckInTime);

        addmovementController = new MovementController(this);

        //add button function for add new info of quarantine center
        mCheckIn.setOnClickListener(view -> {
            CIO_Location= String.valueOf(Objects.requireNonNull(cioLocation.getEditText()).getText());
            CIO_Date = String.valueOf(Objects.requireNonNull(cioDate.getEditText()).getText());
            CIO_Time = String.valueOf(Objects.requireNonNull(cioTime.getEditText()).getText());

            Boolean checkInsertion = addmovementController.Add_CIO(CIO_Location,CIO_Date,CIO_Time);

            if(checkInsertion){
                Toast.makeText(UserCheckIn.this, "Success", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(UserCheckIn.this, "Failed", Toast.LENGTH_SHORT).show();
            }
        });


        setContentView(R.layout.activity_qr_scan);

        mCheckIn = findViewById(R.id.uScanCheckIn);
        mCheckIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserCheckIn.this, CheckIn_Info.class);
                startActivity(intent);
            }
        });
    }
}