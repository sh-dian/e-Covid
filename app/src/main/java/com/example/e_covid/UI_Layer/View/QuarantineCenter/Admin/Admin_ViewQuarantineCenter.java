package com.example.e_covid.UI_Layer.View.QuarantineCenter.Admin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.e_covid.DomainLayer.Controller.QuarantineCenter.QuarantineCenterController;
import com.example.e_covid.R;

public class Admin_ViewQuarantineCenter extends AppCompatActivity {

    QuarantineCenterController adminQuarantineCenterController;

    TextView qcNameInput, qcAddressInput, qcPhoneNumInput, qcFundingInput, qcNumOfBedsInput, qcCapacityInput, qcVentilationCapacity;
    String name, address, phoneNum, funding, numOfBeds, capacity, ventilationCapacity;
    String nameTxt, addressTxt, phoneNumTxt, fundingTxt, numOfBedsTxt, capacityTxt, ventilationCapacityTxt;

    Button mDelete, mUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_view_quarantine_center);

        qcNameInput = findViewById(R.id.qcName_input2);
        qcAddressInput = findViewById(R.id.qcAddress_input2);
        qcPhoneNumInput = findViewById(R.id.qcPhoneNum_input2);
        qcFundingInput = findViewById(R.id.qcFunding_input2);
        qcNumOfBedsInput = findViewById(R.id.qcNumOfBeds_input2);
        qcCapacityInput = findViewById(R.id.qcCapacity_input2);
        qcVentilationCapacity = findViewById(R.id.qcVentilationCapacity_input2);

        mDelete = findViewById(R.id.delete);
        mUpdate = findViewById(R.id.update);
        adminQuarantineCenterController = new QuarantineCenterController(this);

        getAndSetIntentData();

        mDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deleteRecord();
            }
        });
    }

    private void deleteRecord() {
        nameTxt = qcNameInput.getText().toString();
        Boolean checkInsertion = adminQuarantineCenterController.Delete_QC(nameTxt);

        if(checkInsertion == true){
            Toast.makeText(Admin_ViewQuarantineCenter.this, "Success Delete", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(Admin_ViewQuarantineCenter.this, "Failed Delete", Toast.LENGTH_SHORT).show();
        }

        Intent intent = new Intent(Admin_ViewQuarantineCenter.this, Admin_QuarantineCenterMenu.class);
        startActivity(intent);
    }

    void getAndSetIntentData(){
        if(getIntent().hasExtra("name") && getIntent().hasExtra("address") && getIntent().hasExtra("phoneNum")
                && getIntent().hasExtra("funding") && getIntent().hasExtra("numOfBeds") && getIntent().hasExtra("capacity")
                && getIntent().hasExtra("ventilationCapacity")){

            name = getIntent().getStringExtra("name");
            address = getIntent().getStringExtra("address");
            phoneNum = getIntent().getStringExtra("phoneNum");
            funding = getIntent().getStringExtra("funding");
            numOfBeds = getIntent().getStringExtra("numOfBeds");
            capacity = getIntent().getStringExtra("capacity");
            ventilationCapacity = getIntent().getStringExtra("ventilationCapacity");

            //setting intent data
            qcNameInput.setText(name);
            qcAddressInput.setText(address);
            qcPhoneNumInput.setText(phoneNum);
            qcFundingInput.setText(funding);
            qcNumOfBedsInput.setText(numOfBeds);
            qcCapacityInput.setText(capacity);
            qcVentilationCapacity.setText(ventilationCapacity);

        }else{
            Toast.makeText(this, "No Data", Toast.LENGTH_SHORT).show();
        }
    }

}