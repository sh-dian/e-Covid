package com.example.e_covid.View.QuarantineCenter.Admin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.example.e_covid.R;

public class Admin_ViewQuarantineCenter extends AppCompatActivity {

    TextView qcNameInput, qcAddressInput, qcPhoneNumInput, qcFundingInput, qcNumOfBedsInput, qcCapacityInput, qcVentilationCapacity;
    String name, address, phoneNum, funding, numOfBeds, capacity, ventilationCapacity;

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

        getAndSetIntentData();

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