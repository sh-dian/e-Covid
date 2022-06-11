package com.example.e_covid.UI_Layer.View.Login.User;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.e_covid.R;

import java.util.Objects;

public class EditDependent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();

        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_edit_dependent);
    }
}