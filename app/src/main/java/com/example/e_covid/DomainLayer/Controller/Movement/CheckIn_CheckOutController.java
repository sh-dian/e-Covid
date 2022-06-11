package com.example.e_covid.DomainLayer.Controller.Movement;

import android.app.Activity;
import android.database.Cursor;

import com.example.e_covid.DataLayer.Model.Movement.CheckIn_CheckOutModel;
    public class CheckIn_CheckOutController {

        private final CheckIn_CheckOutModel model;

        public CheckIn_CheckOutController(Activity ui) {
            this.model = new CheckIn_CheckOutModel(ui);
        }

        public Boolean Add_VISF(String visfName, String visfPassportNum, String visfOriginCountry, String visfReason, String visfDuration) {
            return model.insertVisf_data(visfName, visfPassportNum, visfOriginCountry, visfReason, visfDuration);
        }

        public Cursor getData() {
            return model.readAllData();
        }
    }
