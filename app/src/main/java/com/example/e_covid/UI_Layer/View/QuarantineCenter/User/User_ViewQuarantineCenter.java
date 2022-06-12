package com.example.e_covid.UI_Layer.View.QuarantineCenter.User;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.example.e_covid.R;

import java.util.Objects;

public class User_ViewQuarantineCenter extends AppCompatActivity {
    TextView qcNameInput, qcAddressInput, qcPhoneNumInput, qcFundingInput, qcNumOfBedsInput, qcCapacityInput, qcVentilationCapacity;
    String name, address, phoneNum, funding, numOfBeds, capacity, ventilationCapacity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_user_view_quarantine_center);

        qcNameInput = findViewById(R.id.qcName_input3);
        qcAddressInput = findViewById(R.id.qcAddress_input3);
        qcPhoneNumInput = findViewById(R.id.qcPhoneNum_input3);
        qcFundingInput = findViewById(R.id.qcFunding_input3);
        qcNumOfBedsInput = findViewById(R.id.qcNumOfBeds_input3);
        qcCapacityInput = findViewById(R.id.qcCapacity_input3);
        qcVentilationCapacity = findViewById(R.id.qcVentilationCapacity_input3);

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