package com.example.e_covid.DomainLayer.Controller.Registration;

import android.app.Activity;
import android.database.Cursor;

import com.example.e_covid.DataLayer.Model.Registration.RegistrationModel;

public class RegistrationController {

    private final RegistrationModel model;


    public RegistrationController(Activity ui) { this.model = new RegistrationModel(ui);}

    public Boolean Add_RE(String RE_name, String RE_Icpassport, String RE_StateCountry, String RE_PhoneNumEmail, int RE_Password, int RE_PasswordRe){
        return model.insertRE_data(RE_name,RE_Icpassport,RE_StateCountry,RE_PhoneNumEmail,RE_Password,RE_PasswordRe);
    }

    public Cursor getData() {
        return model.readAllData();
    }
}
