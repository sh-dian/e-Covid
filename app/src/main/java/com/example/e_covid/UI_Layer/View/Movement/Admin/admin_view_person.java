package com.example.e_covid.UI_Layer.View.Movement.Admin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.e_covid.R;

public class admin_view_person extends AppCompatActivity {

    TextView checkinName, checkinICNumber, checkinPhoneNumber;
    String name, ICNumber, PhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_view_person);

        checkinName = findViewById(R.id.checkinName);
        checkinICNumber = findViewById(R.id.checkinICnumber);
        checkinPhoneNumber = findViewById(R.id.checkinPhoneNumber);

        getAndSetIntentData();
    }

    void getAndSetIntentData(){
        if(getIntent().hasExtra("name") && getIntent().hasExtra("ICNumber") && getIntent().hasExtra("PhoneNumber")){
            name = getIntent().getStringExtra("name");
            ICNumber = getIntent().getStringExtra("ICNumber");
            PhoneNumber = getIntent().getStringExtra("PhoneNumber");

            //setting intent data
            checkinName.setText(name);
            checkinICNumber.setText(ICNumber);
            checkinPhoneNumber.setText(PhoneNumber);

        }else{
            Toast.makeText(this, "No Data", Toast.LENGTH_SHORT).show();
        }
    }
}