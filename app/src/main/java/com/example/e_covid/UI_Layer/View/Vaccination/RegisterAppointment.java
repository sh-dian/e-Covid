package com.example.e_covid.UI_Layer.View.Vaccination;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import com.example.e_covid.DomainLayer.Controller.Vaccination.VaccinationController;
import com.example.e_covid.R;

import java.util.Objects;

public class RegisterAppointment extends AppCompatActivity {

    VaccinationController addappointmentController;

    Button vc_insert;

    TextInputLayout vcName;
    TextInputLayout vcID;
    TextInputLayout vcPhoneNum;
    TextInputLayout vcLocation;

    private String VC_name;
    private String VC_id;
    private String VC_phoneNum;
    private String VC_location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_add_quarantine_center);

        //button add id
        vc_insert = findViewById(R.id.submitAdd);

        //input
        vcName = findViewById(R.id.text_vc_name);
        vcID= findViewById(R.id.text_vc_ID);
        vcPhoneNum = findViewById(R.id.text_vc_phonenum);
        vcLocation = findViewById(R.id.text_vc_location);

        addappointmentController = new VaccinationController(this);

        //add button function for add new info of quarantine center
        vc_insert.setOnClickListener(view -> {
            VC_name= String.valueOf(Objects.requireNonNull(vcName.getEditText()).getText());
            VC_id = String.valueOf(Objects.requireNonNull(vcID.getEditText()).getText());
            VC_phoneNum = String.valueOf(Objects.requireNonNull(vcPhoneNum.getEditText()).getText());
            VC_location = String.valueOf(Objects.requireNonNull(vcLocation.getEditText()).getText());

            Boolean checkInsertion = addappointmentController.Add_VC(VC_name,VC_id,VC_phoneNum,VC_location);

            if(checkInsertion){
                Toast.makeText(RegisterAppointment.this, "Success", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(RegisterAppointment.this, "Failed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}