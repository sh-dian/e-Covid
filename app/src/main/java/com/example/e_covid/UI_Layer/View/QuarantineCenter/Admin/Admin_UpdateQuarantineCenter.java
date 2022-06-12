package com.example.e_covid.UI_Layer.View.QuarantineCenter.Admin;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.e_covid.DomainLayer.Controller.QuarantineCenter.QuarantineCenterController;
import com.example.e_covid.R;

import java.util.Objects;

public class Admin_UpdateQuarantineCenter extends AppCompatActivity {

    //controller object
    QuarantineCenterController adminQuarantineCenterController;

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
        setContentView(R.layout.activity_admin_update_quarantine_center);

        adminQuarantineCenterController = new QuarantineCenterController(this);
    }

    private void addNewRecord() {
        QC_name= String.valueOf(Objects.requireNonNull(qcName.getEditText()).getText());
        QC_address = String.valueOf(Objects.requireNonNull(qcAddress.getEditText()).getText());
        QC_funding = String.valueOf(Objects.requireNonNull(qcFunding.getEditText()).getText());
        QC_phoneNum = String.valueOf(Objects.requireNonNull(qcPhoneNum.getEditText()).getText());
        QC_bedNum = Integer.parseInt(String.valueOf(Objects.requireNonNull(qcBedNum.getEditText()).getText()));
        QC_capacity = Integer.parseInt(String.valueOf(Objects.requireNonNull(qcCapacity.getEditText()).getText()));
        QC_ventilationCapacity = Integer.parseInt(String.valueOf(Objects.requireNonNull(qcVentilationCapacity.getEditText()).getText()));

        Boolean checkInsertion = adminQuarantineCenterController.Update_QC(QC_name,QC_address,QC_funding,QC_phoneNum,
                QC_bedNum,QC_capacity,QC_ventilationCapacity);

        if(checkInsertion == true){
            Toast.makeText(Admin_UpdateQuarantineCenter.this, "Updated Success", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(Admin_UpdateQuarantineCenter.this, "Updated Failed", Toast.LENGTH_SHORT).show();
        }

        Intent intent = new Intent(Admin_UpdateQuarantineCenter.this, Admin_QuarantineCenterMenu.class);
        startActivity(intent);
    }
}