package com.example.e_covid.DomainLayer.Controller.CheckIn_CheckOut;

import android.app.Activity;
import android.database.Cursor;

import com.example.e_covid.DataLayer.Model.CheckIn_CheckOut.CheckIn_CheckOutModel;
    public class CheckIn_CheckOutController {

        private final CheckIn_CheckOutModel model;

        public CheckIn_CheckOutController(Activity ui) {
            this.model = new CheckIn_CheckOutModel(ui);
        }

        public Boolean Add_CIO(String cioName, String cioLocation, String cioPhoneNum, String cioTime, String cioRiskStatus, String cioVaccineStatus) {
            return model.insertCIO_data(cioName, cioLocation, cioPhoneNum, cioTime, cioRiskStatus, cioVaccineStatus);
        }

        public Cursor getData() {
            return model.readAllData();
        }
    }
