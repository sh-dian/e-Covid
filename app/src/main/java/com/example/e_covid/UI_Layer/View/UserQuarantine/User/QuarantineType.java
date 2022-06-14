package com.example.e_covid.UI_Layer.View.UserQuarantine.User;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.e_covid.R;
import com.example.e_covid.UI_Layer.View.Login.User.User_Menu_Page;

import java.util.Objects;

//import androidx.appcompat.app.AppCompatActivity;

public class QuarantineType extends AppCompatActivity {

    public ImageView BackArrow;
    public ImageView MeanPage;
    public Button button1;
    public Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_quarantine_type);

        button1 = (Button) findViewById (R.id.HomeQ);

        button1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuarantineType.this, HomeQuarantineData.class);
                startActivity(intent);
            }
        });

        button2 = (Button) findViewById (R.id.CenterQ);
        button2.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuarantineType.this, CenterQuarantineData.class);
                startActivity(intent);
            }
        });


        BackArrow = findViewById (R.id.Back01);
        BackArrow.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuarantineType.this, UserRegistration.class);
                startActivity(intent);}});
        MeanPage = findViewById (R.id.Home00);
        MeanPage.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuarantineType.this, UserRegistration.class);
                startActivity(intent);}});
    }
}