package com.example.e_covid.View.Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.e_covid.R;
import com.example.e_covid.View.UserQuarantine.User.UserRegistration;

import java.util.Objects;

public class User_MenuPage extends AppCompatActivity {

    public Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //author code - hide action bar
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_user_menu_page);



    button4 = (Button) findViewById (R.id.button4);
        button4.setOnClickListener (new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(User_MenuPage.this, UserRegistration.class);
            startActivity(intent);
        }
    });
}
}