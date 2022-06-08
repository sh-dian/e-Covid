package com.example.e_covid.View.Login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.e_covid.R;
import com.example.e_covid.View.CheckIn_CheckOut.MovementMain;
import com.example.e_covid.View.QuarantineCenter.Admin_QuarantineCenterMenu;

import java.util.Objects;

public class User_MenuPage extends AppCompatActivity {

    Button mUserProfile;
    Button mQuarantineCenter;
    Button mMovement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //author code - hide action bar
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_user_menu_page);

        mQuarantineCenter = findViewById(R.id.qcBtn);
        mUserProfile = findViewById(R.id.userProfile);
        mMovement = findViewById(R.id.CCbtn);

        mQuarantineCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quarantineCenter();
            }
        });

        mUserProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userProfile();
            }
        });

        mMovement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movement();
            }
        });
    }

    private void quarantineCenter() {
        Intent intent = new Intent(User_MenuPage.this, Admin_QuarantineCenterMenu.class);
        startActivity(intent);
    }

    private void userProfile() {
        Intent intent = new Intent(User_MenuPage.this, ManageProfile.class);
        startActivity(intent);
    }

    private void movement() {
        Intent intent = new Intent(User_MenuPage.this, MovementMain.class);
        startActivity(intent);

    }

}