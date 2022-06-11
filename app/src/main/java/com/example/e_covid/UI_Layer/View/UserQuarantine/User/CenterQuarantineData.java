package com.example.e_covid.UI_Layer.View.UserQuarantine.User;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

//import androidx.appcompat.app.AppCompatActivity;

import com.example.e_covid.R;

public class CenterQuarantineData extends AppCompatActivity {

    public Button button;

    public ImageView Image1;
    public ImageView Image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_center_quarantine_data);


/*
        button = (Button) findViewById (R.id.save2);
        button.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CenterQuarantineData.this, CenterQuarantineOptions.class);
                startActivity(intent);
            }
        });

        Image1 = findViewById (R.id.backto2);
        Image1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CenterQuarantineData.this, QuarantineType.class);
                startActivity(intent);
            }
        });
        Image2 = findViewById (R.id.Home1);
        Image2.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CenterQuarantineData.this, UserRegistration.class);
                startActivity(intent);
            }
        });*/
    }
}