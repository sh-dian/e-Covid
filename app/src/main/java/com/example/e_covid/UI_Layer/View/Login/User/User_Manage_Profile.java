package com.example.e_covid.UI_Layer.View.Login.User;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.e_covid.R;

import java.util.Objects;

public class User_Manage_Profile extends AppCompatActivity {

    Button mUpdateProfile;
    Button mManageDependent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_manage_profile);

        mUpdateProfile = findViewById(R.id.update_profile);
        mManageDependent = findViewById(R.id.manageDependent);

        mUpdateProfile.setOnClickListener(view -> updateProfile());

        mManageDependent.setOnClickListener(view -> manageDependent());
    }

    private void updateProfile() {
        Intent intent = new Intent(User_Manage_Profile.this, User_Update_Profile.class);
        startActivity(intent);
    }

    private void manageDependent() {
        Intent intent = new Intent(User_Manage_Profile.this, User_Manage_Dependent_Profile.class);
        startActivity(intent);
    }
}