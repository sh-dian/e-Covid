package com.example.e_covid.UI_Layer.View.Login.User;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.e_covid.DomainLayer.Controller.Login.LoginController;
import com.example.e_covid.R;

import java.util.Objects;

public class registration extends AppCompatActivity {

    //controller object
    LoginController userregistrationController ;

    //button object
    Button mRegister;
    Button mGotacc;

    //TextInputLayout
    EditText re_Name;
    EditText reIcpassport;
    EditText reStateCountry;
    EditText rePhoneNumEmail;
    EditText rePassword;
    EditText rePasswordRe;

    private String RE_name;
    private String  RE_Icpassport;
    private String RE_StateCountry;
    private String RE_PhoneNumEmail;
    private int RE_Password;
    private int RE_PasswordRe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();

        setContentView(R.layout.activity_registration);

        mRegister = findViewById(R.id.Register);
        mGotacc = findViewById(R.id.loginpage);

        re_Name = findViewById(R.id.name_user);
        reIcpassport = findViewById(R.id.passportNum);
        reStateCountry = findViewById(R.id.country);
        rePhoneNumEmail = findViewById(R.id. email_phoneNum);
        rePassword = findViewById(R.id.password);
        rePasswordRe = findViewById(R.id.passwordConfirm);

        userregistrationController = new LoginController(this);


        //add button function for add new info of quarantine center
        mRegister.setOnClickListener(view -> {
            RE_name= String.valueOf(Objects.requireNonNull(re_Name.getText()));
            RE_Icpassport = String.valueOf(Objects.requireNonNull (reIcpassport.getText()));
            RE_StateCountry = String.valueOf(Objects.requireNonNull(reStateCountry.getText()));
            RE_PhoneNumEmail = String.valueOf(Objects.requireNonNull(rePhoneNumEmail.getText()));
            RE_Password = Integer.parseInt(String.valueOf(Objects.requireNonNull(rePassword.getText())));
            RE_PasswordRe = Integer.parseInt(String.valueOf(Objects.requireNonNull(rePasswordRe.getText())));

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