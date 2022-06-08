package com.example.e_covid.View.Login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.e_covid.R;

import java.util.Objects;

public class ManageDependentProfile extends AppCompatActivity {

    Button mAddDependent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_manage_dependent_profile);

        mAddDependent = findViewById(R.id.Add_dependents);
        mAddDependent.setOnClickListener(view -> {
            Intent intent = new Intent(ManageDependentProfile.this, addDependent.class);
            startActivity(intent);
        });
    }
}