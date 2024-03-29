package com.example.e_covid.UI_Layer.View.Login.User;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.e_covid.R;

import java.util.Objects;

public class User_Update_Profile extends AppCompatActivity {

    Button mSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_update_user_profile);

        mSave = findViewById(R.id.SaveUpdate);
        mSave.setOnClickListener(view -> {
            Intent intent = new Intent(User_Update_Profile.this, User_Manage_Profile.class);
            startActivity(intent);
        });
    }
}