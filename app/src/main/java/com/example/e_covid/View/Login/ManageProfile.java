package com.example.e_covid.View.Login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.e_covid.R;

import java.util.Objects;

public class ManageProfile extends AppCompatActivity {

    Button mUpdateProfile;
    Button mManageDependent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_manage_profile);

        mUpdateProfile = findViewById(R.id.update_profile);
        mManageDependent = findViewById(R.id.manageDependent);

        mUpdateProfile.setOnClickListener(view -> updateProfile());

        mManageDependent.setOnClickListener(view -> manageDependent());
    }

    private void updateProfile() {
        Intent intent = new Intent(ManageProfile.this, updateUserProfile.class);
        startActivity(intent);
    }

    private void manageDependent() {
        Intent intent = new Intent(ManageProfile.this, ManageDependentProfile.class);
        startActivity(intent);
    }
}