package com.example.e_covid.View.CheckIn_CheckOut.User;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.e_covid.R;

import java.util.Objects;

public class CheckIn_VisitorForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();

        setContentView(R.layout.activity_check_in_visitor_form);
    }
}