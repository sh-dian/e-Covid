package com.example.e_covid.View.QuarantineCenter;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.e_covid.Controller.QuarantineCenter.QuarantineCenterController;
import com.example.e_covid.Model.QuarantineCenter.QuarantineCenterModel;
import com.example.e_covid.R;

public class Admin_AddQuarantineCenter extends AppCompatActivity {

    //controller object
    QuarantineCenterController quarantineCenterController;

    //button object
    Button a_insert;

    //TextInputLayout
    TextInputLayout qcName;
    TextInputLayout qcAddress;
    private String QC_name;
    private String QC_address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_add_quarantine_center);

        //button add id
        a_insert = findViewById(R.id.a_add_info);

        //input
        qcName = findViewById(R.id.text_qc_name);
        qcAddress = findViewById(R.id.text_qc_address);

        quarantineCenterController = new QuarantineCenterController(this);

        a_insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                QC_name= String.valueOf(qcName.getEditText().getText());
                QC_address = String.valueOf(qcAddress.getEditText().getText());

                Boolean checkInsertion = quarantineCenterController.Add_QC(QC_name,QC_address);

                if(checkInsertion == true){
                    Toast.makeText(Admin_AddQuarantineCenter.this, "Success", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Admin_AddQuarantineCenter.this, "Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}