package com.example.e_covid.UI_Layer.View.UserQuarantine.User;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.e_covid.R;

//import androidx.appcompat.app.AppCompatActivity;


public class UserRegistration extends AppCompatActivity {
    public Button button;
    public Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration);

        button = (Button) findViewById (R.id.Registration);
        button.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserRegistration.this, QuarantineType.class);
                startActivity(intent);
            }
        });


        button1 = (Button) findViewById (R.id.View);
        button1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserRegistration.this, QuarantineDetails.class);
                startActivity(intent);
            }
        });
    }
}