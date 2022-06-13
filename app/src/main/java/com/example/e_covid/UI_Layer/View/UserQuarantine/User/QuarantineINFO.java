package com.example.e_covid.UI_Layer.View.UserQuarantine.User;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

//import androidx.appcompat.app.AppCompatActivity;

import com.example.e_covid.R;
import com.example.e_covid.UI_Layer.View.Login.User.User_Menu_Page;

public class QuarantineINFO extends AppCompatActivity {


    public ImageView BackArrow;
    public ImageView MeanPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarantine_info);




        BackArrow = findViewById (R.id.Back06);
        BackArrow.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuarantineINFO.this, QuarantineDetails.class);
                startActivity(intent);}});
        MeanPage = findViewById (R.id.Home00);
        MeanPage.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuarantineINFO.this, UserRegistration.class);
                startActivity(intent);}});
    }
}