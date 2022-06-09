package com.example.e_covid.View.UserQuarantine.User;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

//import androidx.appcompat.app.AppCompatActivity;

import com.example.e_covid.R;

public class QuarantineDetails extends AppCompatActivity {

    public Button button;
    public Button button1;

    public ImageView Image1;
    public ImageView Image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarantine_details);


        button = (Button) findViewById (R.id.viewQ);
        button.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuarantineDetails.this, QuarantineINFO.class);
                startActivity(intent);
            }
        });
        button1 = (Button) findViewById (R.id.dailyQ);
        button1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuarantineDetails.this, DailyQuestions.class);
                startActivity(intent);
            }
        });

        Image1 = findViewById (R.id.backto1);
        Image1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuarantineDetails.this, QuarantineType.class);
                startActivity(intent);
            }
        });
        Image2 = findViewById (R.id.Home1);
        Image2.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuarantineDetails.this, UserRegistration.class);
                startActivity(intent);
            }
        });
    }
}