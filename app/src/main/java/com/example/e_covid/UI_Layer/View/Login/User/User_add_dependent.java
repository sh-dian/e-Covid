
package com.example.e_covid.UI_Layer.View.Login.User;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.e_covid.R;

import java.util.Objects;

public class User_add_dependent extends AppCompatActivity {

    Button mAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();

        setContentView(R.layout.activity_add_dependent);

        mAdd = findViewById(R.id.Add_dependents);
        mAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User_add_dependent.this, User_Manage_Profile.class);
                startActivity(intent);
            }
        });
    }
}