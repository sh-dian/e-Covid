package com.example.e_covid.View.Login.MOH;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.e_covid.R;

import java.util.Objects;

public class MOHLogin extends AppCompatActivity {

    Button mLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_mohlogin);

        mLogin = findViewById(R.id.moh_Login);
        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MOHLogin.this, MOH_MenuPage.class);
                startActivity(intent);
            }
        });
    }
}