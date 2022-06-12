package com.example.e_covid.UI_Layer.View.QuarantineCenter.Admin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.e_covid.DomainLayer.Controller.QuarantineCenter.QuarantineCenterController;
import com.example.e_covid.R;

public class Admin_UpdateQuarantineCenter extends AppCompatActivity {

    //controller object
    QuarantineCenterController adminQuarantineCenterController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_update_quarantine_center);

        adminQuarantineCenterController = new QuarantineCenterController(this);
    }
}