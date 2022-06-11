package com.example.e_covid.DomainLayer.Controller.Movement;

import android.app.Activity;
import android.database.Cursor;

import com.example.e_covid.DataLayer.Model.Movement.MovementModel;
    public class MovementController {

        private final MovementModel model;

        public MovementController(Activity ui) {
            this.model = new MovementModel(ui);
        }

        public Boolean Add_CIO(String cioLocation, String cioDate, String cioTime) {
            return model.insertCIO_data(cioLocation, cioDate, cioTime);
        }

        public Cursor getData() {
            return model.readAllData();
        }
    }
