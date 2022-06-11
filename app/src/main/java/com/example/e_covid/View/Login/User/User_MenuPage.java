package com.example.e_covid.View.Login.User;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.e_covid.R;
import com.example.e_covid.View.CheckIn_CheckOut.User.MovementMain;
import com.example.e_covid.View.QuarantineCenter.User.User_SearchQuarantineCenter;
import com.example.e_covid.View.UserQuarantine.User.CenterQuarantineOptions;
import com.example.e_covid.View.Vaccination.VaccinationMain;

import java.util.Objects;

public class User_MenuPage extends AppCompatActivity {

    Button mUserProfile;
    Button mQuarantineCenter;
    Button mMovement;
    Button mVaccination;
    Button mUserQuarantine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //author code - hide action bar
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_user_menu_page);

        mUserProfile = findViewById (R.id.userProfile);
        mQuarantineCenter = findViewById (R.id.qcBtn);
        mMovement = findViewById (R.id.CCbtn);
        mVaccination = findViewById(R.id.vcbutton);
        mUserQuarantine = findViewById(R.id.userQuarantine);

        mUserProfile.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                userProfile();
            }
        });

        mQuarantineCenter.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                quarantineCenter();
            }
        });

        mMovement.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                movement();
            }
        });

        mVaccination.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                vcMain();
            }
        });

        mUserQuarantine.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                userQuarantine();
            }
        });

}

    private void movement() {
        Intent intent = new Intent(User_MenuPage.this, MovementMain.class);
        startActivity(intent);
    }

    private void quarantineCenter() {
        Intent intent = new Intent(User_MenuPage.this, User_SearchQuarantineCenter.class);
        startActivity(intent);
    }

    private void userQuarantine() {
        Intent intent = new Intent(User_MenuPage.this, CenterQuarantineOptions.class);
        startActivity(intent);
    }

    private void userProfile() {
        Intent intent = new Intent(User_MenuPage.this, ManageProfile.class);
        startActivity(intent);
    }

    public void vcMain() {
        Intent intent = new Intent(User_MenuPage.this, VaccinationMain.class);
        startActivity(intent);
    }
}