package com.example.e_covid.DomainLayer.Controller.Vaccination;

import android.app.Activity;

import com.example.e_covid.DataLayer.Model.Vaccination.VaccinationModel;

public class VaccinationController{
    private final VaccinationModel model;

    public VaccinationController(Activity ui){this.model = new VaccinationModel(ui);}

    public Boolean Add_VC(String vcName, String vcIC, String vcPhoneNum, String vcLocation){
        return model.insertVC_data(vcName, vcIC, vcPhoneNum, vcLocation);
    }
}