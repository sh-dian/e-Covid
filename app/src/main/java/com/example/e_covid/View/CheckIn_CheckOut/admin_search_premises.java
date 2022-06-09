package com.example.e_covid.View.CheckIn_CheckOut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.e_covid.R;

public class admin_search_premises extends AppCompatActivity {

    TextView premisesLocation, ownername, ownerIcNumber, ownerPhoneNumber;
    String location, name, ICNumber, PhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_search_person);

        premisesLocation = findViewById(R.id.premisesLocation);
        ownername = findViewById(R.id.ownername);
        ownerIcNumber = findViewById(R.id.ownerIcNumber);
        ownerPhoneNumber = findViewById(R.id.ownerPhoneNumber);

        getAndSetIntentData();
    }

    void getAndSetIntentData(){
        if(getIntent().hasExtra("location") && getIntent().hasExtra("name") && getIntent().hasExtra("ICNumber")  && getIntent().hasExtra("PhoneNumber")){
            location = getIntent().getStringExtra("location");
            name = getIntent().getStringExtra("name");
            ICNumber = getIntent().getStringExtra("ICNumber");
            PhoneNumber = getIntent().getStringExtra("PhoneNumber");

            //setting intent data
            premisesLocation.setText(location);
            ownername.setText(name);
            ownerIcNumber.setText(ICNumber);
            ownerPhoneNumber.setText(PhoneNumber);

        }else{
            Toast.makeText(this, "No Data", Toast.LENGTH_SHORT).show();
        }
    }
}