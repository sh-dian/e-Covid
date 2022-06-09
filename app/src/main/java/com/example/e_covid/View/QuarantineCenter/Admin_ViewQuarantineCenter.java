package com.example.e_covid.View.QuarantineCenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.e_covid.R;

public class Admin_ViewQuarantineCenter extends AppCompatActivity {

    TextView qcNameInput, qcAddressInput;
    String name, address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_view_quarantine_center);

        qcNameInput = findViewById(R.id.qcName_input2);
        qcAddressInput = findViewById(R.id.qcAddress_input2);

        getAndSetIntentData();

    }

    void getAndSetIntentData(){
        if(getIntent().hasExtra("name") && getIntent().hasExtra("address")){
            name = getIntent().getStringExtra("name");
            address = getIntent().getStringExtra("address");

            //setting intent data
            qcNameInput.setText(name);
            qcAddressInput.setText(address);

        }else{
            Toast.makeText(this, "No Data", Toast.LENGTH_SHORT).show();
        }
    }

}