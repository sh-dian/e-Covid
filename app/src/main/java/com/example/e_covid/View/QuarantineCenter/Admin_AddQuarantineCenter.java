package com.example.e_covid.View.QuarantineCenter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import com.example.e_covid.Controller.QuarantineCenter.QuarantineCenterController;
import com.example.e_covid.R;

import java.util.Objects;

public class Admin_AddQuarantineCenter extends AppCompatActivity {

    //controller object
    QuarantineCenterController adminQuarantineCenterController;

    //button object
    Button a_insert;

    //TextInputLayout
    TextInputLayout qcName;
    TextInputLayout qcAddress;
    TextInputLayout qcFunding;
    TextInputLayout qcPhoneNum;
    TextInputLayout qcBedNum;
    TextInputLayout qcCapacity;
    TextInputLayout qcVentilationCapacity;

    private String QC_name;
    private String QC_address;
    private String QC_funding;
    private String QC_phoneNum;
    private int QC_bedNum;
    private int QC_capacity;
    private int QC_ventilationCapacity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_add_quarantine_center);

        //button add id
        a_insert = findViewById(R.id.a_add_info);

        //input
        qcName = findViewById(R.id.text_qc_name);
        qcAddress = findViewById(R.id.text_qc_address);
        qcFunding = findViewById(R.id.text_fundingBy);
        qcPhoneNum = findViewById(R.id.text_phoneNum);
        qcBedNum = findViewById(R.id.text_num_beds);
        qcCapacity = findViewById(R.id.text_qc_capacity);
        qcVentilationCapacity = findViewById(R.id.text_ventilation_capacity);

        adminQuarantineCenterController = new QuarantineCenterController(this);

        //add button function for add new info of quarantine center
        a_insert.setOnClickListener(view -> {
            QC_name= String.valueOf(Objects.requireNonNull(qcName.getEditText()).getText());
            QC_address = String.valueOf(Objects.requireNonNull(qcAddress.getEditText()).getText());
            QC_funding = String.valueOf(Objects.requireNonNull(qcFunding.getEditText()).getText());
            QC_phoneNum = String.valueOf(Objects.requireNonNull(qcPhoneNum.getEditText()).getText());
            QC_bedNum = Integer.parseInt(String.valueOf(Objects.requireNonNull(qcBedNum.getEditText()).getText()));
            QC_capacity = Integer.parseInt(String.valueOf(Objects.requireNonNull(qcCapacity.getEditText()).getText()));
            QC_ventilationCapacity = Integer.parseInt(String.valueOf(Objects.requireNonNull(qcVentilationCapacity.getEditText()).getText()));

            Boolean checkInsertion = adminQuarantineCenterController.Add_QC(QC_name,QC_address,QC_funding,QC_phoneNum,
                    QC_bedNum,QC_capacity,QC_ventilationCapacity);

            if(checkInsertion){
                Toast.makeText(Admin_AddQuarantineCenter.this, "Success", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(Admin_AddQuarantineCenter.this, "Failed", Toast.LENGTH_SHORT).show();
            }

            Intent intent = new Intent(Admin_AddQuarantineCenter.this, Admin_QuarantineCenterMenu.class);
            startActivity(intent);
        });

    }
}