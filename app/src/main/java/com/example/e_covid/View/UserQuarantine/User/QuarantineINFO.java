package com.example.e_covid.View.UserQuarantine.User;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

//import androidx.appcompat.app.AppCompatActivity;

import com.example.e_covid.R;

public class QuarantineINFO extends AppCompatActivity {


    public ImageView Image1;
    public ImageView Image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quarantine_info);



        Image1 = findViewById (R.id.backto3);
        Image1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuarantineINFO.this, QuarantineDetails.class);
                startActivity(intent);
            }
        });
        Image2 = findViewById (R.id.Home1);
        Image2.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuarantineINFO.this, UserRegistration.class);
                startActivity(intent);
            }
        });
    }
}