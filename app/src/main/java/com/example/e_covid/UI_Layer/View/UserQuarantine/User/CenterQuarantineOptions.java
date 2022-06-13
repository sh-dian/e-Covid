package com.example.e_covid.UI_Layer.View.UserQuarantine.User;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

//import androidx.appcompat.app.AppCompatActivity;

import com.example.e_covid.R;

public class CenterQuarantineOptions extends AppCompatActivity {

    public ImageView BackArrow;
    public ImageView MeanPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_center_quarantine_options);



        BackArrow = findViewById (R.id.Back04);
        BackArrow.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CenterQuarantineOptions.this, CenterQuarantineData.class);
                startActivity(intent);}});
        MeanPage = findViewById (R.id.Home00);
        MeanPage.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CenterQuarantineOptions.this, UserRegistration.class);
                startActivity(intent);}});
    }
}