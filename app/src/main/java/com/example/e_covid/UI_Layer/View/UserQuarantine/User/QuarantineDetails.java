package com.example.e_covid.UI_Layer.View.UserQuarantine.User;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

//import androidx.appcompat.app.AppCompatActivity;

import com.example.e_covid.R;

import java.util.Objects;

public class QuarantineDetails extends AppCompatActivity {

    public ImageView BackArrow;
    public ImageView MeanPage;
    public Button button;
    public Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
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


        BackArrow = findViewById (R.id.Background);
        BackArrow.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuarantineDetails.this, UserRegistration.class);
                startActivity(intent);}});
        MeanPage = findViewById (R.id.Home00);
        MeanPage.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuarantineDetails.this, UserRegistration.class);
                startActivity(intent);}});
    }
}