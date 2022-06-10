package com.example.e_covid.View.Login;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.example.e_covid.Controller.Registration.RegistrationController;
import com.example.e_covid.R;


import java.util.Objects;

public class registration extends AppCompatActivity {

    //controller object
    RegistrationController userregistrationController ;

    //button object
    Button mRegister;
    Button mGotacc;

    //TextInputLayout
    TextInputLayout re_Name;
    TextInputLayout reIcpassport;
    TextInputLayout reStateCountry;
    TextInputLayout rePhoneNumEmail;
    TextInputLayout rePassword;
    TextInputLayout rePasswordRe;

    private String RE_name;
    private String  RE_Icpassport;
    private String RE_StateCountry;
    private String RE_PhoneNumEmail;
    private int RE_Password;
    private int RE_PasswordRe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        mRegister = findViewById(R.id.Register);
        mGotacc = findViewById(R.id.loginpage);

        re_Name = findViewById(R.id.name_user);
        reIcpassport = findViewById(R.id.passportNum);
        reStateCountry = findViewById(R.id.country);
        rePhoneNumEmail = findViewById(R.id. email_phoneNum);
        rePassword = findViewById(R.id.password);
        rePasswordRe = findViewById(R.id.passwordConfirm);

        userregistrationController = new RegistrationController(this);


        //add button function for add new info of quarantine center
        mRegister.setOnClickListener(view -> {
            RE_name= String.valueOf(Objects.requireNonNull(re_Name.getEditText()).getText());
            RE_Icpassport = String.valueOf(Objects.requireNonNull (reIcpassport.getEditText()).getText());
            RE_StateCountry = String.valueOf(Objects.requireNonNull(reStateCountry.getEditText()).getText());
            RE_PhoneNumEmail = String.valueOf(Objects.requireNonNull(rePhoneNumEmail.getEditText()).getText());
            RE_Password = Integer.parseInt(String.valueOf(Objects.requireNonNull(rePassword.getEditText()).getText()));
            RE_PasswordRe = Integer.parseInt(String.valueOf(Objects.requireNonNull(rePasswordRe.getEditText()).getText()));

            Boolean checkInsertion = userregistrationController.Add_RE(RE_name, RE_Icpassport, RE_StateCountry, RE_PhoneNumEmail, RE_Password, RE_PasswordRe);

            if(checkInsertion){
                Toast.makeText(registration.this, "Success", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(registration.this, "Failed", Toast.LENGTH_SHORT).show();
            }

            Intent intent = new Intent(registration.this, LoginActivity.class );
            startActivity(intent);
        });
        {
                mGotacc.setOnClickListener(v -> {
                    Intent intent = new Intent(registration.this, LoginActivity.class);
                    startActivity(intent);
                });
        }
    }
}